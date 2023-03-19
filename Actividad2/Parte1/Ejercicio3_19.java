package com.mycompany.ejercicio._19;

import java.util.Scanner;
public class Ejercicio3_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado, h;
        System.out.println("Ingrese el valor de un lado:");
        lado = input.nextDouble();
        h = Math.sqrt(Math.pow(lado,2) - Math.pow((lado/2),2));
        System.out.println("El perímetro del triángulo equilátero es: " + (lado*3));
        System.out.println("La altura de este triángulo es de: " + h);
        System.out.println("El área de este triángulo es de: " + ((lado*h)/2));
    }
}
