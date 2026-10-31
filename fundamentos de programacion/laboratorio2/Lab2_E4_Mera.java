/*
 * Nombre completo: Miguel Mera
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Leer un número impar y positivo n (validado con do-while) y
 * dibujar un rombo de asteriscos de n filas.
 */
import java.util.Scanner;

public class Lab2_E4_Mera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // do-while: la lectura debe hacerse al menos una vez
        do {
            System.out.print("Ingrese el tamaño n (impar y positivo): ");
            n = sc.nextInt();
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Valor inválido: n debe ser impar y positivo.");
            }
        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2;                           // índice de la fila central

        for (int fila = 0; fila < n; fila++) {
            // distancia al borde: crece hasta la mitad y luego decrece
            int d = (fila <= mitad) ? fila : n - 1 - fila;
            int espacios = mitad - d;
            int asteriscos = 2 * d + 1;

            for (int e = 0; e < espacios; e++) {
                System.out.print(" ");
            }
            for (int a = 0; a < asteriscos; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
