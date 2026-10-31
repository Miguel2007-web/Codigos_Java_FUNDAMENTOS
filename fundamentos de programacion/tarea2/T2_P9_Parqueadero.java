import java.util.Locale;
import java.util.Scanner;

public class T2_P9_Parqueadero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PRIMERA_HORA = 1.00;
        final double HORA_ADICIONAL = 0.50;
        final double TOPE_DIARIO = 6.00;

        System.out.print("Horas de permanencia (enteras): ");
        int horas = sc.nextInt();

        if (horas < 1) {
            System.out.println("Error: debe ingresar al menos 1 hora.");
        } else {
            double total = PRIMERA_HORA + (horas - 1) * HORA_ADICIONAL;
            if (total > TOPE_DIARIO) {
                total = TOPE_DIARIO;
                System.out.println("Se aplico el tope diario.");
            }
            System.out.printf("Total a pagar: $%.2f%n", total);
        }
        sc.close();
    }
}
