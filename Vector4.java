import java.util.Scanner;

public class Vector4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] paises = new String[10];
        for (int i = 0; i < paises.length; i++) {
            System.out.print("Ingrese el pais " + (i + 1) + ": ");
            paises[i] = sc.nextLine();
        }
        System.out.print("Pais a buscar: ");
        String buscado = sc.nextLine();
        int indice = -1;
        for (int i = 0; i < paises.length; i++) {
            if (paises[i].equalsIgnoreCase(buscado)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) System.out.println("El pais se encuentra en el indice " + indice);
        else System.out.println("Aviso: el pais \"" + buscado + "\" no se encuentra en el vector.");
    }
}
