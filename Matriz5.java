import java.util.Random;
import java.util.Scanner;

public class Matriz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[][] m = new int[4][4];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                m[i][j] = rnd.nextInt(10) + 1;

        System.out.println("Matriz generada:");
        for (int[] fila : m) {
            for (int x : fila) System.out.printf("%5d", x);
            System.out.println();
        }

        System.out.print("Numero a buscar: ");
        int buscado = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] == buscado) {
                    System.out.println("Encontrado en fila " + i + ", columna " + j);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) System.out.println("El numero " + buscado + " no se encuentra en la matriz.");
    }
}
