// Miguel Angel Mera Rizo - NRC 37712 - 22/10/2026
// E3: suma de cifras, numero invertido y paridad de un entero de 4 cifras
import java.util.Scanner;

public class Lab1_E3_Mera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Entero de cuatro cifras: ");
        int n = sc.nextInt();

        // PROCESO: extraccion de cifras con / y %
        int millares = n / 1000;
        int centenas = (n / 100) % 10;
        int decenas = (n / 10) % 10;
        int unidades = n % 10;

        int suma = millares + centenas + decenas + unidades;
        int invertido = unidades * 1000 + decenas * 100 + centenas * 10 + millares;
        boolean esPar = n % 2 == 0;

        // SALIDA
        System.out.println("Suma de cifras: " + suma);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);
        sc.close();
    }
}
