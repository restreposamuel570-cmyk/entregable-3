import java.util.Random;

public class Matriz4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = 4;
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = rnd.nextInt(50) + 1;

        System.out.println("Matriz generada:");
        for (int[] fila : m) {
            for (int x : fila) System.out.printf("%5d", x);
            System.out.println();
        }

        int suma = 0;
        for (int i = 0; i < n; i++) suma += m[i][i];
        System.out.println("Suma de la diagonal principal: " + suma);
    }
}
