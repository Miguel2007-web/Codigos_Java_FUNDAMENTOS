/*
 * Nombre completo: Miguel Mera
 * NRC: 37712
 * Fecha: 29/10/2026
 * Enunciado: Imprimir la tabla de multiplicar del 1 al 10 como matriz de
 * 10 filas por 10 columnas, con cada valor alineado a la derecha.
 */
public class Lab2_E1_Mera {
    public static void main(String[] args) {
        final int TAMANO = 10;

        // Ciclo externo: una vuelta por cada fila (multiplicando i)
        for (int i = 1; i <= TAMANO; i++) {
            // Ciclo interno: completa las 10 columnas de la fila actual
            for (int j = 1; j <= TAMANO; j++) {
                System.out.printf("%4d", i * j);   // ancho fijo de 4, a la derecha
            }
            System.out.println();                   // salto de línea al terminar la fila
        }
    }
}
