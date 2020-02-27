package es.iespablopicasso.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Crucero extends ObjetoVolador {

/*

    //ESTADO

    static private final String NOMBRE_SPRITE = "crucero1.png";
    static private final String NOMBRE_SPRITE_2 = "crucero2.png";
    static private final String NOMBRE_SPRITE_3 = "crucero3.png";

    static private final float POSICION_INICIAL_Y = 100f;
    static private final float POSICION_INICIAL_X = 1.0f;

    static private final float VELOCIDAD_INICIAL_Y = 0f;
    static private final float VELOCIDAD_INICIAL_X = 8.0f;

    private int pasos=0;
    protected Texture img2;
    protected Texture img3;
    private byte pasospintarse=0;

    private  int anchopantalladiv2;


    //COMPORTAMIENTO

    //CONSTRUCTOR
    public Crucero(int anchopant) {
        super(POSICION_INICIAL_X, POSICION_INICIAL_Y, VELOCIDAD_INICIAL_X, VELOCIDAD_INICIAL_Y, NOMBRE_SPRITE);
        img2 = new Texture(NOMBRE_SPRITE_2);
        img3 = new Texture(NOMBRE_SPRITE_3);

        anchopantalladiv2=anchopant/2;
    }
    //RESTO DE ESTADO


    @Override
    public void moverse(){
        super.moverse();
        velX-=8/(anchopantalladiv2/velX);
        if(posX>anchopantalladiv2){

            if(pasos<50){
                velX=0;
            }

            else if(pasos>50){
                velX+=8/(anchopantalladiv2/VELOCIDAD_INICIAL_X);
            }
            pasos++;
        }
    }

    @Override
    public void pintarse(SpriteBatch miSB){
        super.pintarse(miSB);

        Texture temporal;
        pasospintarse++;

        if (pasospintarse%20==0){
            temporal = img;
            img = img2;
            img2 = temporal;
            img2=img3;
            img3=temporal;
        }


    }
}*/

//estado
    static private final float POSX_I=0;
    static private final float POSY_I = 0;
    static private final float VELX_I=3.0f;
    static private final float VELY_I=0;
    static private final String imagen="enemigo.png";
    private byte pasos;
    private int anchoPandiv2;
    //comportamiento



    //contructror
    public Crucero(int anchoPantalla){
        super(POSX_I,POSY_I,VELX_I,VELY_I,imagen);

        pasos=0;
        anchoPandiv2=anchoPantalla/2;
    }
    @Override
    public void moverse() {
        super.moverse();

            if (posX >= anchoPandiv2 && pasos<20) {
                velX = 0;
                pasos++;
            }
            if(pasos==20){
                velX=3.0f;
            }


    }

}





