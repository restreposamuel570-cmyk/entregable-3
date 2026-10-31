import java.util.Scanner;

public class Vector5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] notas = new double[5];
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Calificacion final de " + nombres[i] + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
            suma += notas[i];
        }
        double promedio = suma / 5;
        System.out.println("Promedio general del grupo: " + promedio);
        System.out.println("Estudiantes con nota mayor o igual al promedio:");
        for (int i = 0; i < 5; i++) {
            if (notas[i] >= promedio) System.out.println(" - " + nombres[i] + " (" + notas[i] + ")");
        }
    }
}
