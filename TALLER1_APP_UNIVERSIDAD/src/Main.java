public class Main {
    public static void main(String[] args){
        Estudiantes estudiantes1 = new Estudiantes("Jhon", "Layton", "Software", 4, "Aplicaciones moviles"); // CREACION 1ER OBJETO ESTUDIANTES

        estudiantes1.recibirMateria("Aplicaciones moviles"); // USO 1RA FUNCION ESTUDIANTES
        estudiantes1.mostrarDatos(); // USO 2DA FUNCION ESTUDIANTES

        Carnetizacion carnetizacion = new Carnetizacion("Jhon", "Layton", "Software", 4, "Aplicaciones moviles", 211003, 1000522558); // CREACION 1ER OBJETO CARNETIZACION
        carnetizacion.mostrarDatos(); // USO 1RA FUNCION CARNETIZACION

        Miscelanea miscelanea1 = new Miscelanea("Jhon", "Layton", "software", 4, "Aplicaciones moviles", 21003, 1000522558, null); // CREACION PRIMER OBJETO MISCELANEA
        miscelanea1.comprarProductos(); // USO 1RA FUNCION MISCELANEA
    }
}
