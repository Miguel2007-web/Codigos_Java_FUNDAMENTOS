import java.util.Locale;
import java.util.Scanner;

public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1 (0-20): ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2 (0-20): ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3 (0-20): ");
        double n3 = sc.nextDouble();

        if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20 || n3 < 0 || n3 > 20) {
            System.out.println("Error: cada nota debe estar entre 0 y 20.");
        } else {
            double promedio = (n1 + n2 + n3) / 3;
            String estado;
            if (promedio >= 14) {
                estado = "Aprobado";
            } else if (promedio >= 9) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }
            System.out.printf("Promedio: %.2f%n", promedio);
            System.out.println("Estado: " + estado);
        }
        sc.close();
    }
}
