public class Coche {
    String marca;
    String modelo;

   
    public Coche() {
        this.marca = "Desconocida";
    }

   
    public Coche(String marca) {
        this.marca = marca;
    }

   
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}