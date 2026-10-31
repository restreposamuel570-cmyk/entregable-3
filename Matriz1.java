import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        int suma = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                suma += m[i][j];
        System.out.println("Suma de todos los elementos: " + suma);
    }
}
