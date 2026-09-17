import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Libro con constructor por defecto
        Libro libro1 = new Libro();

        System.out.println("--- Datos del libro ---");
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = Integer.parseInt(sc.nextLine());
        Libro libro2 = new Libro(titulo, autor, paginas);

        // 2. CuentaBancaria con distintos constructores
        CuentaBancaria cuenta1 = new CuentaBancaria();

        System.out.println("--- Datos de la cuenta ---");
        System.out.print("Número de cuenta: ");
        String numCuenta = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = Double.parseDouble(sc.nextLine());
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        CuentaBancaria cuenta2 = new CuentaBancaria(numCuenta, saldo, tipoCuenta);

        // 3. Estudiante con distintos constructores
        Estudiante estudiante1 = new Estudiante();

        System.out.println("--- Datos del estudiante ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        Estudiante estudiante2 = new Estudiante(nombre, edad, curso);

        System.out.println("\n=== RESULTADOS ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(estudiante1);
        System.out.println(estudiante2);

        sc.close();
    }
}