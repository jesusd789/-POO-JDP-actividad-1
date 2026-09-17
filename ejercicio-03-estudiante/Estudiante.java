public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // 1. Constructor por defecto
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Sin asignar";
    }

    // 2. Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin asignar";
    }

    // 3. Constructor con todos los parámetros, usa this() para encadenar
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // llama al constructor de dos parámetros
        this.curso = curso;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCurso() { return curso; }

    @Override
    public String toString() {
        return "Estudiante{nombre='" + nombre + "', edad=" + edad +
               ", curso='" + curso + "'}";
    }
}