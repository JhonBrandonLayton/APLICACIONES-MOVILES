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

