package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;



//ESTADO

public class ColeccionAliada {

    static private final byte NUM_NAVES = 3;

    protected ArrayList<NavesAliadas> listaAliada;

    protected float posVertical;


    //COMPORTAMIENTO

    public ColeccionAliada(short anchoPant,float posicionVert) {
        byte i; //contador básico
        NavesAliadas amigo;

        int distanciaEntreNaves = anchoPant/(NUM_NAVES+1);

        //creamos la lista de enemigos
        listaAliada = new ArrayList();

        posVertical = posicionVert;

        for (i=0;i<NUM_NAVES;i++) {
            amigo = new NavesAliadas((float)((i+1)*distanciaEntreNaves),posVertical,anchoPant);
            listaAliada.add(amigo);
        }
    }


    public void pintarse(SpriteBatch miSB) {

        for (NavesAliadas amigo :listaAliada) {
            amigo.pintarse(miSB);
        }

    }


    public void moverse(EstadoTeclado et){

       for (NavesAliadas amigo:listaAliada){
            amigo.moverse(et);
        }

    }

    public void dispose(){

        for (NavesAliadas amigo: listaAliada){
            amigo.dispose();
        }
    }



}
