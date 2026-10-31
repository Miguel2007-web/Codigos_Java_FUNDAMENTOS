import java.util.Locale;
import java.util.Scanner;

public class T2_P2_DescuentoVolumen {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PRECIO_SACO = 8.50;
        final double IVA = 0.15;
        final double DESC_MEDIO = 0.05;
        final double DESC_ALTO = 0.10;

        System.out.print("Numero de sacos: ");
        int sacos = sc.nextInt();

        if (sacos < 1) {
            System.out.println("Error: la cantidad debe ser al menos 1 saco.");
        } else {
            double subtotal = sacos * PRECIO_SACO;
            double tasaDesc = 0;
            if (sacos > 50) {
                tasaDesc = DESC_ALTO;
            } else if (sacos > 20) {
                tasaDesc = DESC_MEDIO;
            }
            double descuento = subtotal * tasaDesc;
            double baseImponible = subtotal - descuento;
            double valorIva = baseImponible * IVA;
            double total = baseImponible + valorIva;

            System.out.printf("Subtotal:       $%.2f%n", subtotal);
            System.out.printf("Descuento (%.0f%%): $%.2f%n", tasaDesc * 100, descuento);
            System.out.printf("IVA (15%%):      $%.2f%n", valorIva);
            System.out.printf("TOTAL A PAGAR:  $%.2f%n", total);
        }
        sc.close();
    }
}
