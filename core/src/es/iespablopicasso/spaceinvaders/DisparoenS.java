package es.iespablopicasso.spaceinvaders;

public class DisparoenS extends ObjetoVolador {

/*
    static private final String NOMBRE_SPRITE = "disparo_enemigo.png";

    static private final float VELOCIDAD_INICIAL_Y = -1.0f;
    static private final float VELOCIDAD_INICIAL_X = 0.0f;

    private float acelerar= 1.0f;

    private float movimiento=0;




    public DisparoenS(float nuevaPosX, float nuevaPosY) {
        super(nuevaPosX, nuevaPosY,VELOCIDAD_INICIAL_X,VELOCIDAD_INICIAL_Y,NOMBRE_SPRITE);

    }


    @Override
    public void moverse(){
        super.moverse();

        if (movimiento==2){

            if(velX==-8){

                acelerar=+1;

            }else if(velX==8){

                acelerar=-1;
            }

            velX+=acelerar;

            movimiento=0;

        }else {
            movimiento++;
        }

    }*/

    static private final String NOMBRE_SPRITE = "disparo_enemigo.png";

    static private final float VELOCIDAD_INICIAL_Y = -1.0f;
    static private final float VELOCIDAD_INICIAL_X = 0.0f;


    private float movimiento=0;




    public DisparoenS(float nuevaPosX, float nuevaPosY) {
        super(nuevaPosX, nuevaPosY,VELOCIDAD_INICIAL_X,VELOCIDAD_INICIAL_Y,NOMBRE_SPRITE);

    }


    @Override
    public void moverse(){
        super.moverse();

        if (movimiento==50){
            velX=0;
            velY=-1;
        }else if(movimiento==100){
            velX=-1;
            velY=0;
        }else if(movimiento==150){
            velX=0;
            velY=-1;
        }else if(movimiento==200){
            velX=1;
            velY=0;
            movimiento=0;
        }

        movimiento++;

    }






}
