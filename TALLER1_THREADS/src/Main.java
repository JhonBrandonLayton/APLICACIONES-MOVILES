
public class Main {
    public static void main(String[] args) throws Exception {
        
        Proceso1 hilo1 = new Proceso1(); //CREACION OBJETO PROCESO CANCION
        Thread hilo2 = new Thread(new Proceso2()); //CREACION OBJETO DATOS USUARIO

        hilo1.reproducirCancion("cancion.wav");//Traer archivo musical
        hilo1.start(); //Iniciar hilo 1
        hilo2.start(); //Iniciar hilo 2

        //LIMITAR TIEMPO DE REPRODUCCION DE CANCION
        /* try{
            Thread.sleep(20000);
            hilo1.detenerCancion();
        } catch(InterruptedException e){
            e.printStackTrace();
        } */
    }
}
