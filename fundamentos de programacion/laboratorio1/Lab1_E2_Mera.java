// Miguel Angel Mera Rizo - NRC 37712 - 22/10/2026
// E2: desglose de segundos totales en horas, minutos y segundos
import java.util.Scanner;

public class Lab1_E2_Mera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Tiempo total en segundos: ");
        int total = sc.nextInt();

        // PROCESO: division entera y modulo
        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        // SALIDA
        System.out.printf("%d s = %d h %d min %d s%n", total, horas, minutos, segundos);

        // Verificacion: horas*3600 + minutos*60 + segundos debe igualar el valor leido
        int reconstruido = horas * 3600 + minutos * 60 + segundos;
        System.out.println("Reconstruccion correcta: " + (reconstruido == total));
        sc.close();
    }
}
