package es.iespablopicasso.spaceinvaders;

public class teletransportada extends ObjetoVolador {


    //ESTADO

    static private final String NOMBRE_SPRITE = "crucero2.png";

    static private final float VELOCIDAD_INICIAL_Y = 0.0f;
    static private final float VELOCIDAD_INICIAL_X = 0.0f;

    private float nuevaPosX;
    static private final float POSICION_INICIAL_Y = 400.0f;

    private int alto_pantalla;
    private int altopantdvi2;
    private int anchopant;
    private int limiteizquierdo=(int)(posX=1);
    private int pasos;

    double dado;

    //COMPORTAMIENTO

    //CONSTRUCTOR

    public teletransportada(float posx_ini, int altopantentre2, int altopant, int anchodepantalla){
        super(posx_ini,POSICION_INICIAL_Y,VELOCIDAD_INICIAL_X,VELOCIDAD_INICIAL_Y,NOMBRE_SPRITE);

        nuevaPosX=posx_ini;
        anchopant=anchodepantalla;
        altopantdvi2=altopantentre2;
        alto_pantalla=altopant;
        pasos=0;

    }


    @Override
    public void moverse(){
        super.moverse();


        float posicionx_actual;
        float posiciony_actual;

        for(pasos=0;pasos<=1000;pasos++)
            if (pasos==1000){
                dado=Math.random()*50;

                posicionx_actual=getPosX();
                posiciony_actual=getPosY();

                if (dado<1 && posiciony_actual>altopantdvi2 && posiciony_actual<alto_pantalla && posicionx_actual<anchopant && posicionx_actual>limiteizquierdo){
                    posX=posicionx_actual+(float)(Math.random()*50);
                    posY=posiciony_actual+(float)(Math.random()*50);
                    pasos=0;
                }
                else if(dado>49 && posiciony_actual>altopantdvi2 && posiciony_actual<alto_pantalla && posicionx_actual<anchopant && posicionx_actual>limiteizquierdo){
                    posX=posicionx_actual-(float)(Math.random()*50);
                    posY=posiciony_actual-(float)(Math.random()*50);
                    pasos=0;
                }

                else if(posiciony_actual>= alto_pantalla | posiciony_actual<=altopantdvi2){
                    posY=POSICION_INICIAL_Y;
                }
                else if( posicionx_actual>=anchopant |posicionx_actual<=limiteizquierdo){
                    posX=300;
                }
            }


    }


    public DisparoenS disparar() {

        DisparoenS nuevoDisparo;


        nuevoDisparo = new DisparoenS(posX, posY);
        return nuevoDisparo;

    }









}
