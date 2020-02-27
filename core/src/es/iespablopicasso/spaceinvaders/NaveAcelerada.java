package es.iespablopicasso.spaceinvaders;

public class NaveAcelerada extends ObjetoVolador {

    //ESTADO

    static private final String NOMBRE_SPRITE = "acelerada.png";

    static private final float VELOCIDAD_INICIAL_Y = 5.0f;
    static private final float VELOCIDAD_INICIAL_X = 8.0f;

    static private final float POSICION_INICIAL_Y = 20.0f;


    private float acelerar= 1.0f;

    //cada dos movimientos tiene que moverse
    private float movimiento=0;


    //CONSTRUCTOR

    public NaveAcelerada(int AnchoPantalla) {
        super((float) (Math.random()*(AnchoPantalla)), POSICION_INICIAL_Y, VELOCIDAD_INICIAL_X, VELOCIDAD_INICIAL_Y, NOMBRE_SPRITE);

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

    }


}
