public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

   
    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas >= 0) {
            this.numeroPaginas = numeroPaginas;
        } else {
            System.out.println("El número de páginas no puede ser negativo.");
        }
    }

    
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor +
               "', numeroPaginas=" + numeroPaginas + "}";
    }
}