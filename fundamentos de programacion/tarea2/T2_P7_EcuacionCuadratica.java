import java.util.Locale;
import java.util.Scanner;

public class T2_P7_EcuacionCuadratica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Error: 'a' no puede ser 0 (no seria una ecuacion cuadratica).");
        } else {
            double disc = b * b - 4 * a * c;
            System.out.printf("Discriminante: %.2f%n", disc);
            if (disc > 0) {
                double x1 = (-b + Math.sqrt(disc)) / (2 * a);
                double x2 = (-b - Math.sqrt(disc)) / (2 * a);
                System.out.printf("Dos raices reales distintas: x1 = %.2f, x2 = %.2f%n", x1 + 0.0, x2 + 0.0);
            } else if (disc == 0) {
                double x = -b / (2 * a);
                System.out.printf("Raiz doble: x = %.2f%n", x + 0.0);
            } else {
                System.out.println("Sin raices reales.");
            }
        }
        sc.close();
    }
}
