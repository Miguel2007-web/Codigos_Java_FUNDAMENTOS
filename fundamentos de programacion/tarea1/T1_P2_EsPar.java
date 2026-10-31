import java.util.Locale;
import java.util.Scanner;

public class T1_P2_EsPar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        System.out.println("Es par? " + (n % 2 == 0));
        sc.close();
    }
}
