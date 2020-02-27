package es.iespablopicasso.spaceinvaders;

public class NaveLoca extends ObjetoVolador {



    //ESTADO

    static private final String NOMBRE_SPRITE = "nave_loca.png";

    static private final float VELOCIDAD_INICIAL_Y = 5.0f;
    static private final float VELOCIDAD_INICIAL_X = 0.0f;

    static private final float POSICION_X = 500.0f;
    static private final float POSICION_Y = 0.0f;



    //COMPORTAMIENTO

    //CONSTRUCTOR


    public NaveLoca() {
        super(POSICION_X, POSICION_Y, VELOCIDAD_INICIAL_X, VELOCIDAD_INICIAL_Y, NOMBRE_SPRITE);
    }


    //RESTO DE ESTADOS


    @Override
    public void moverse(){
        super.moverse();
        double numerorandom=Math.random()*10;

        if(numerorandom>5 && velX<5){
            velX++;
        } else if(numerorandom<5 && velX>-5) {
            velX--;
        }

    }
}
