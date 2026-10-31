import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        long n = Math.abs(sc.nextLong());
        int cifras = 0;
        int suma = 0;
        if (n == 0) {
            cifras = 1;
        }
        while (n != 0) {
            suma += n % 10;
            cifras++;
            n /= 10;
        }
        System.out.println("Cantidad de cifras: " + cifras);
        System.out.println("Suma de cifras: " + suma);
        sc.close();
    }
}
