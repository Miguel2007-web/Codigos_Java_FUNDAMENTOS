import java.util.Locale;
import java.util.Scanner;

public class T1_P3_Cifras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero de 3 cifras: ");
        int n = sc.nextInt();

        int centenas = n / 100;
        int decenas = (n / 10) % 10;
        int unidades = n % 10;

        System.out.println("Centenas = " + centenas);
        System.out.println("Decenas = " + decenas);
        System.out.println("Unidades = " + unidades);
        sc.close();
    }
}
