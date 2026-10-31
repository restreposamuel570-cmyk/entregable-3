import java.util.Scanner;

public class Vector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
            suma += v[i];
        }
        double promedio = (double) suma / v.length;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
