public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "0000-0000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // 2. Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }

    // 3. Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        // Validación de datos
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo, se asigna 0.");
            this.saldo = 0.0;
        }
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }
    public String getTipoCuenta() { return tipoCuenta; }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido.");
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{numeroCuenta='" + numeroCuenta +
               "', saldo=" + saldo + ", tipoCuenta='" + tipoCuenta + "'}";
    }
}