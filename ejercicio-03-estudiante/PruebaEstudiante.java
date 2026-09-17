public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Laura Pérez", 20);
        Estudiante e3 = new Estudiante("Carlos Ruiz", 22, "POO - Unidad 2");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}