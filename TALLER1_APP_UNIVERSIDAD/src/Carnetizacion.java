class Carnetizacion extends Estudiantes{ // USO EXTENDS
    private int codigo;
    private int tarjetaIdentidad;

    public Carnetizacion(String nombre, String apellido, String carrera, int semestre, String materia, int _codigo, int _tarjetaIdentidad){
        super(nombre, apellido, carrera, semestre, materia); // USO SUPER
        codigo = _codigo;
        tarjetaIdentidad = _tarjetaIdentidad;
    }
    // GETTERS
    public int getCodigo() {
        return codigo;
    }

    public int getTarjetaIdentidad() {
        return tarjetaIdentidad;
    }
    // SETTERS
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTarjetaIdentidad(int tarjetaIdentidad) {
        this.tarjetaIdentidad = tarjetaIdentidad;
    } 

    //SOBRECARGA DE METODO PARA CARNETIZACION
    public void mostrarDatos(){
        System.out.println("------DATOS CARNETIZACION-----");
        System.out.println("NOMBRE: "+getNombre());
        System.out.println("APELLIDO: "+getApellido());
        System.out.println("TARJETA IDENTIDAD: "+getTarjetaIdentidad());
        System.out.println("CARRERA: "+getCarrera());
        System.out.println("CODIGO: "+getCodigo()+"\n");
    }
}
