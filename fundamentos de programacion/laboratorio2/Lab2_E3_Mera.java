/*
 * Nombre completo: Miguel Mera
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Juego "Adivina el número": número aleatorio entre 1 y 100,
 * 7 intentos, pista de "más alto" o "más bajo" en cada intento e informe
 * final de acierto (con número de intentos) o del número secreto.
 */
import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Mera {
    public static void main(String[] args) {
        final int MAX_INTENTOS = 7;
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();
        int secreto = azar.nextInt(100) + 1;         // número entre 1 y 100

        int intentos = 0;
        boolean acerto = false;

        System.out.println("Adivina el número entre 1 y 100. Tienes " + MAX_INTENTOS + " intentos.");

        do {
            System.out.print("Intento " + (intentos + 1) + " de " + MAX_INTENTOS + " - su número: ");
            int propuesta = sc.nextInt();
            intentos++;                              // el contador cambia en cada vuelta

            if (propuesta == secreto) {
                acerto = true;
            } else if (propuesta < secreto) {
                System.out.println("Más alto");
            } else {
                System.out.println("Más bajo");
            }
        } while (!acerto && intentos < MAX_INTENTOS); // condición compuesta

        if (acerto) {
            System.out.println("¡Acertaste en " + intentos + " intento(s)!");
        } else {
            System.out.println("Perdiste. El número era " + secreto + ".");
        }
        sc.close();
    }
}
