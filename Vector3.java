import java.util.Scanner;

public class Vector3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < v.length / 2; i++) {
            int temp = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = temp;
        }
        System.out.print("Vector invertido: ");
        for (int n : v) System.out.print(n + " ");
        System.out.println();
    }
}
