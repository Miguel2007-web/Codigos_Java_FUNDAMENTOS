import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();
        long suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        long formula = (long) n * (n + 1) / 2;
        System.out.println("Suma con ciclo: " + suma);
        System.out.println("Suma con formula: " + formula);
        if (suma == formula) {
            System.out.println("Los resultados coinciden");
        } else {
            System.out.println("Los resultados no coinciden");
        }
        sc.close();
    }
}
