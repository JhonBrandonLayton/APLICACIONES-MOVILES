import java.util.Scanner; // IMPORTACION LIBRERIA ENTRADA DE DATOS
public class Miscelanea extends Estudiantes{ //USO EXTENDS
    private String producto;

    // GETTERS
    public String getProducto(){
        return producto;
    }

    // SETTERS
    public void setProducto(String producto){
        this.producto = producto;
    }

    // METODO CONSTRUCTOR CON EXTENDS
    public Miscelanea(String nombre, String apellido, String carrera, int semestre, String materia, int _codigo, int _tarjetaIdentidad, String _producto){
        super(nombre, apellido, carrera, semestre, materia); // USO SUPER
        producto = _producto;
    }

    // METODO PRINCIPAL MISCELANEA
    public void comprarProductos(){
        System.out.println("-----MISCELANEA UNIVERSITARIA-----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Fotocopias $200 und.\n2 Lapices $700 und\n3 libros $15.000 und");
        System.out.print("Ingrese el numero de producto que desea: ");
        int producto = scanner.nextInt();
        switch (producto) {
            case 1:
                System.out.println("El estudiante "+getNombre()+" realizo la compra de fotocopias por valor de: $200");
            break;
            case 2:
                System.out.println("El estudiante "+getNombre()+" realizo la compra de lapices por valor de $700");
            break;
            case 3:
                System.out.println("El estudiante "+getNombre()+" realizo la compra de libros por valor de $15.000");
            break;
            default:
                System.out.println("El estudiante no realizo compras o fue cancelada cancelo");
            break;
        }
        scanner.close();
        
    }
}
