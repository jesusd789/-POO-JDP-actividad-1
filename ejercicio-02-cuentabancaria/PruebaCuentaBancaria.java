public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria c2 = new CuentaBancaria("1002-5567", "Corriente");
        CuentaBancaria c3 = new CuentaBancaria("1003-8842", 500000.0, "Ahorros");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}