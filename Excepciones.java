public class Excepciones {

    static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }

    static void retirar(double saldo, double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente: tiene " + saldo + " y quiere retirar " + monto);
        }
        System.out.println("Retiro exitoso. Nuevo saldo: " + (saldo - monto));
    }

    public static void main(String[] args) {
        System.out.println("--- Ejemplo 1: ArithmeticException ---");
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero. (" + e.getMessage() + ")");
        }

        System.out.println("\n--- Ejemplo 2: ArrayIndexOutOfBoundsException ---");
        try {
            int[] v = new int[3];
            v[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice fuera de rango. (" + e.getMessage() + ")");
        }

        System.out.println("\n--- Ejemplo 3: NumberFormatException ---");
        try {
            int n = Integer.parseInt("abc123");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no es un numero valido. (" + e.getMessage() + ")");
        }

        System.out.println("\n--- Ejemplo 4: NullPointerException y finally ---");
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: la variable es null y no se puede usar.");
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        System.out.println("\n--- Ejemplo 5: Excepcion personalizada ---");
        try {
            retirar(50000, 80000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
