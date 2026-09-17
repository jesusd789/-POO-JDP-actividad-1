public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        libro1.mostrarDetalles();
        System.out.println("---");
        libro2.mostrarDetalles();
    }
}