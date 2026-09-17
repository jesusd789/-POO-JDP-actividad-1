public class PruebaCocheS {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        Coche c2 = new Coche("Mazda");
        Coche c3 = new Coche("Renault", "Logan");
        System.out.println("Marca: " + c1.marca);
        System.out.println("Marca: " + c2.marca);
        System.out.println("Marca: " + c3.marca + " Modelo: " + c3.modelo);
    }
}