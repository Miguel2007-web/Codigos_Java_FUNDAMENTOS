// Miguel Angel Mera Rizo - NRC 37712 - 22/10/2026
// E5: verificacion de la evaluacion de expresiones hecha a mano
public class Lab1_E5_Mera {
    public static void main(String[] args) {
        int a = 9, b = 4;
        System.out.println("1) " + (a / b + a % b * 2));
        System.out.println("2) " + (10 - 3 * 2 > 3 && 5 % 2 == 1));
        System.out.println("3) " + ((double) 7 / 2 + 7 / 2));
        System.out.println("4) " + (!(4 >= 4) || 2 * 3 != 6));
    }
}
