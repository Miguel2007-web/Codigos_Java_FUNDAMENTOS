import java.util.Locale;
import java.util.Scanner;

public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer numero: ");
        double a = sc.nextDouble();
        System.out.print("Segundo numero: ");
        double b = sc.nextDouble();
        System.out.print("Tercer numero: ");
        double c = sc.nextDouble();

        if (a == b || a == c || b == c) {
            System.out.println("Error: los tres numeros deben ser distintos.");
        } else {
            double mayor, medio, menor;
            if (a > b) {
                if (b > c) {
                    mayor = a; medio = b; menor = c;
                } else if (a > c) {
                    mayor = a; medio = c; menor = b;
                } else {
                    mayor = c; medio = a; menor = b;
                }
            } else {
                if (a > c) {
                    mayor = b; medio = a; menor = c;
                } else if (b > c) {
                    mayor = b; medio = c; menor = a;
                } else {
                    mayor = c; medio = b; menor = a;
                }
            }
            System.out.printf("De mayor a menor: %s, %s, %s%n", fmt(mayor), fmt(medio), fmt(menor));
        }
        sc.close();
    }

    private static String fmt(double x) {
        return (x == (long) x) ? String.valueOf((long) x) : String.valueOf(x);
    }
}
