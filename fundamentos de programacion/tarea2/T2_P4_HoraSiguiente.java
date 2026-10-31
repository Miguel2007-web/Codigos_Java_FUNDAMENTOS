import java.util.Locale;
import java.util.Scanner;

public class T2_P4_HoraSiguiente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la hora (hh mm ss): ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Error: rangos validos hh 0-23, mm 0-59, ss 0-59.");
        } else {
            s++;
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0;
                    }
                }
            }
            System.out.printf("Un segundo despues: %02d:%02d:%02d%n", h, m, s);
        }
        sc.close();
    }
}
