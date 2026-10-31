/*
 * Nombre completo: Miguel Mera
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Cajero automático con menú repetitivo (do-while + switch) y
 * saldo inicial de $500: 1) consultar, 2) depositar, 3) retirar, 0) salir.
 * No se permiten montos negativos o cero, ni retiros mayores al saldo.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab2_E5_Mera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 500.00;
        int opcion;

        do {                                         // el menú se muestra al menos una vez
            System.out.println();
            System.out.println("=== CAJERO AUTOMÁTICO ===");
            System.out.println("1) Consultar saldo");
            System.out.println("2) Depositar");
            System.out.println("3) Retirar");
            System.out.println("0) Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf(Locale.US, "Saldo: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito aceptado");
                    } else {
                        System.out.println("Monto inválido");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro aceptado");
                    } else {
                        System.out.println("Fondos insuficientes o monto inválido");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);
        sc.close();
    }
}
