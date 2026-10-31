import java.util.Scanner;

public class Vector2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[8];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ingrese el numero decimal " + (i + 1) + ": ");
            v[i] = sc.nextDouble();
        }
        double mayor = v[0], menor = v[0];
        int posMayor = 0, posMenor = 0;
        for (int i = 1; i < v.length; i++) {
            if (v[i] > mayor) { mayor = v[i]; posMayor = i; }
            if (v[i] < menor) { menor = v[i]; posMenor = i; }
        }
        System.out.println("Mayor: " + mayor + " en la posicion (indice) " + posMayor);
        System.out.println("Menor: " + menor + " en la posicion (indice) " + posMenor);
    }
}
