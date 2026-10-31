import java.util.Scanner;

public class Matriz2 {
    static void imprimir(int[][] m) {
        for (int[] fila : m) {
            for (int x : fila) System.out.printf("%5d", x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int[][] t = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                t[j][i] = m[i][j];
        System.out.println("\nMatriz original:");
        imprimir(m);
        System.out.println("\nMatriz transpuesta:");
        imprimir(t);
    }
}
