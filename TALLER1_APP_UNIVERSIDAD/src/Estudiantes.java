interface Mostrable{
    void mostrarDatos();
}
public class Estudiantes implements Mostrable{ //USO IMPLEMENTS
    private String nombre;
    private String apellido;
    private String carrera;
    private int semestre;
    private String materia;

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getMateria() {
        return materia;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    //METODO CONSTRUCTOR
    public Estudiantes(String _nombre, String _apellido, String _carrera, int _semestre, String _materia){
        nombre = _nombre;
        apellido = _apellido;
        carrera = _carrera;
        semestre = _semestre;
        materia = _materia;
    } 

    //METODO BASICO
    public void recibirMateria(String materia){
        System.out.println("El estudiante: "+nombre+" "+apellido+" recibe la materia "+materia);
    }

    //METODO MOSTRAR DATOS BASICOS ESTUDIANTE
    public void mostrarDatos(){
        System.out.println("------DATOS ESTUDIANTE---- ");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+apellido);
        System.out.println("CARRERA: "+carrera);
        System.out.println("SEMESTRE: "+semestre);
        System.out.println("MATERIA: "+materia+"\n");
    }

}
