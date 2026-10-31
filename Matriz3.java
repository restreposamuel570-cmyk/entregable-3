import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) sumaFila += m[i][j];
            System.out.println("Suma de la fila " + i + ": " + sumaFila);
        }
        for (int j = 0; j < 4; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 3; i++) sumaCol += m[i][j];
            System.out.println("Suma de la columna " + j + ": " + sumaCol);
        }
    }
}
