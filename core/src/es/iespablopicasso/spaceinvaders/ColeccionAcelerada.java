package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class ColeccionAcelerada {

    static private final byte NUM_NAVES = 3;

    protected ArrayList<NaveAcelerada> listaAcelerada;

    public ColeccionAcelerada(int anchoPant) {
        byte i; //contador básico
            NaveAcelerada veloz;

        int distanciaEntreNaves = anchoPant/(NUM_NAVES+1);

        //creamos la lista de enemigos
        listaAcelerada = new ArrayList();


        for (i=0;i<NUM_NAVES;i++) {
            veloz = new NaveAcelerada(anchoPant);
            listaAcelerada.add(veloz);
        }
    }


    public void pintarse(SpriteBatch miSB) {

        for (NaveAcelerada veloz :listaAcelerada) {
            veloz.pintarse(miSB);
        }

    }


    public void moverse(){

        for (NaveAcelerada veloz:listaAcelerada){
            veloz.moverse();
        }

    }

    public void dispose(){

        for (NaveAcelerada veloz: listaAcelerada){
            veloz.dispose();
        }
    }



}
