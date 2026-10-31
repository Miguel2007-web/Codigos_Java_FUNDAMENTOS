import java.util.Locale;
import java.util.Scanner;

public class T1_P4_MinutosHoras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los minutos: ");
        int total = sc.nextInt();

        int horas = total / 60;
        int minutos = total % 60;

        System.out.println(total + " min = " + horas + " h " + minutos + " min");
        sc.close();
    }
}
