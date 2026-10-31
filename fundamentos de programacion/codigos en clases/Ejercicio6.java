public class Ejercicio6 {
    public static void main(String[] args) {
        long poblacion = 100;
        int horas = 0;
        while (poblacion <= 1000000) {
            poblacion *= 2;
            horas++;
        }
        System.out.println("Horas necesarias: " + horas);
        System.out.println("Poblacion final: " + poblacion);
    }
}
