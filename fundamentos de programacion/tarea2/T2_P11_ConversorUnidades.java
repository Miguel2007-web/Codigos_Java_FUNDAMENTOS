import java.util.Locale;
import java.util.Scanner;

public class T2_P11_ConversorUnidades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double M_A_FT = 3.28084;
        final double KG_A_LB = 2.20462;

        System.out.println("=== CONVERSOR DE UNIDADES ===");
        System.out.println("1) Metros a pies");
        System.out.println("2) Kilogramos a libras");
        System.out.println("3) Grados Celsius a Fahrenheit");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Metros: ");
            double m = sc.nextDouble();
            if (m < 0) {
                System.out.println("Error: la longitud no puede ser negativa.");
            } else {
                System.out.printf("%.2f m = %.2f ft%n", m, m * M_A_FT);
            }
        } else if (opcion == 2) {
            System.out.print("Kilogramos: ");
            double kg = sc.nextDouble();
            if (kg < 0) {
                System.out.println("Error: la masa no puede ser negativa.");
            } else {
                System.out.printf("%.2f kg = %.2f lb%n", kg, kg * KG_A_LB);
            }
        } else if (opcion == 3) {
            System.out.print("Grados Celsius: ");
            double c = sc.nextDouble();
            if (c < -273.15) {
                System.out.println("Error: por debajo del cero absoluto (-273.15 C).");
            } else {
                System.out.printf("%.2f C = %.2f F%n", c, c * 9 / 5 + 32);
            }
        } else {
            System.out.println("Opcion invalida (elija 1, 2 o 3).");
        }
        sc.close();
    }
}
