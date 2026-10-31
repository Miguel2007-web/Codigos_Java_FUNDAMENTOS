import java.util.Locale;
import java.util.Scanner;

public class T1_P1_Rectangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perim = 2 * (base + altura);

        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perim);
        sc.close();
    }
}
