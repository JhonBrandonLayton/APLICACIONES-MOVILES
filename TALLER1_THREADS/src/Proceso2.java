import java.util.Scanner;
public class Proceso2 implements Runnable{
    public void run(){
        System.out.println("BIENVENIDO AL HILO 2 DEL PROGRAMA, POR FAVOR INGRESE LOS SIGUIENTES DATOS: ");
        System.out.println("Ingrese su nombre: ");
        Scanner lectura = new Scanner(System.in);
        String nombre = lectura.nextLine();
        System.out.println("Bienvenido "+nombre+" , por favor escribe tu edad: "); 
        int edad = lectura.nextInt();   
        System.out.println("Por favor ingrese su carrera: ");  
        String carrera = lectura.next();
        System.out.println("Por favor ingrese su semestre: ");
        int semestre = lectura.nextInt();
        System.out.println("Sus datos son los siguientes\nNombre: "+nombre+"\nEdad: "+edad+"\nCarrera: "+carrera+"\nSemestre "+semestre);
        System.out.println("Gracias por ser parte del test de hilos en Java:) ");
    }
}
