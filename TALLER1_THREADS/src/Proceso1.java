import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Proceso1 extends Thread{
    public void run(){}

    private Clip clip; //DATO Y COMPLEMENTOS DE LIBRERIA

    public void reproducirCancion(String rutaArchivo){
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(rutaArchivo)); //FLUJO DE ENTRADA DE AUDIO
            clip = AudioSystem.getClip(); //INTERFAZ PARA REPRODUCIR AUDIO USANDO CLIP
            clip.open(audioInputStream); //ABRIR FLUJO DE AUDIO Y PREPARAR EJECUCION


            System.out.println("Reproduciendo la cancion..");
            System.out.println("Artista: Skrillex\nCancion: Bangarang\nLanzamiento: 16 de febrero de 2012\nGenero: Dusbtep, Electro House\nSello discografico: Big Beat Records, Atlantic Records\nDuracion: 3 minutos y 35 segundos\nEnlace: https://www.youtube.com/watch?v=YJVmu6yttiw");
            clip.start();//REPRODUCIR CANCION
        }catch(Exception e){
            e.printStackTrace(); //MANEJO DE ERRORES
        }
    }

    public void detenerCancion(){
        if (clip != null && clip.isRunning()){
            System.out.println("Deteniendo la cancion...");
            clip.stop(); //DETENER CANCION
        }
    }
}

