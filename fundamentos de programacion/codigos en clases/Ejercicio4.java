import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double suma = 0;
        int contador = 0;
        System.out.print("Temperatura (-999 para terminar): ");
        double t = sc.nextDouble();
        while (t != -999) {
            if (t > mayor) {
                mayor = t;
            }
            if (t < menor) {
                menor = t;
            }
            suma += t;
            contador++;
            System.out.print("Temperatura (-999 para terminar): ");
            t = sc.nextDouble();
        }
        if (contador == 0) {
            System.out.println("No se ingresaron temperaturas");
        } else {
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.println("Promedio: " + (suma / contador));
        }
        sc.close();
    }
}
