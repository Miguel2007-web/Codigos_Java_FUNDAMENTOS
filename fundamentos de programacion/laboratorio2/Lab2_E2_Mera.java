/*
 * Nombre completo: Miguel Mera
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Leer lecturas de temperatura hasta ingresar un valor negativo
 * (centinela). Mostrar cantidad de lecturas válidas, promedio, máximo y
 * mínimo con 2 decimales, sin dividir para cero si no hubo lecturas.
 */
import java.util.Locale;
import java.util.Scanner;

public class Lab2_E2_Mera {
    public static void main(String[] args) {
        // Locale.US: el separador decimal es el punto (20.5) en cualquier equipo
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Contador y acumulador se inicializan justo antes del ciclo
        int contador = 0;
        double suma = 0;
        double maximo = 0;
        double minimo = 0;

        System.out.println("Ingrese lecturas de temperatura (un valor negativo termina).");
        System.out.print("Lectura: ");
        double lectura = sc.nextDouble();            // lectura inicial (antes del ciclo)

        while (lectura >= 0) {                       // el centinela es cualquier valor negativo
            if (contador == 0) {
                maximo = lectura;                    // primera lectura válida: inicializa
                minimo = lectura;                    // máximo y mínimo (no se usa 0)
            } else {
                if (lectura > maximo) {
                    maximo = lectura;
                }
                if (lectura < minimo) {
                    minimo = lectura;
                }
            }
            suma += lectura;
            contador++;

            System.out.print("Lectura: ");
            lectura = sc.nextDouble();               // actualiza la variable de control
        }

        if (contador > 0) {                          // evita dividir para cero
            double promedio = suma / contador;
            System.out.printf(Locale.US,
                    "Lecturas: %d Promedio: %.2f Max: %.2f Min: %.2f%n",
                    contador, promedio, maximo, minimo);
        } else {
            System.out.println("No hubo lecturas válidas: no se muestran estadísticas.");
        }
        sc.close();
    }
}
