import java.util.Locale;
import java.util.Scanner;

public class T2_P8_AnioBisiesto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el anio: ");
        int anio = sc.nextInt();

        if (anio <= 0) {
            System.out.println("Error: el anio debe ser positivo.");
        } else if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " no es bisiesto.");
        }
        sc.close();
    }
}
