// Miguel Angel Mera Rizo - NRC 37712 - 22/10/2026
// E1: conversion de Celsius a Fahrenheit y Kelvin en tabla alineada
import java.util.Locale;
import java.util.Scanner;

public class Lab1_E1_Mera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA
        System.out.print("Temperatura en Celsius: ");
        double celsius = sc.nextDouble();

        // PROCESO: 9.0/5.0 evita la division entera
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        // SALIDA
        System.out.printf("%-12s%10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s%10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s%10.2f%n", "Kelvin", kelvin);
        sc.close();
    }
}
