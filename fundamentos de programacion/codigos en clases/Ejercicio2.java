import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese n (n >= 0): ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Valor invalido, intente de nuevo");
            }
        } while (n < 0);
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        sc.close();
    }
}
