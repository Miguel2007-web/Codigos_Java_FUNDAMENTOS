import java.util.Locale;
import java.util.Scanner;

public class T2_P10_Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado a: ");
        double a = sc.nextDouble();
        System.out.print("Lado b: ");
        double b = sc.nextDouble();
        System.out.print("Lado c: ");
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: los lados deben ser positivos.");
        } else if (!(a + b > c && a + c > b && b + c > a)) {
            System.out.println("Los lados NO forman un triangulo.");
        } else if (a == b && b == c) {
            System.out.println("Triangulo equilatero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangulo isosceles.");
        } else {
            System.out.println("Triangulo escaleno.");
        }
        sc.close();
    }
}
