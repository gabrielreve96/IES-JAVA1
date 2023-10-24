import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }

// Guardar el último elemento en una variable temporal
        int ultimoElemento = numeros[9];

// Desplazar los elementos hacia la derecha
        for (int i = 9; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

// El último elemento se convierte en el primero
        numeros[0] = ultimoElemento;

// Mostrar el array después del desplazamiento
        System.out.println("Después del desplazamiento:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();

    }
}
