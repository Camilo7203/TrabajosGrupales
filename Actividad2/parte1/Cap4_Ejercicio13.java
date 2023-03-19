package parte1;

import java.util.Scanner;
public class Cap4_Ejercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float com;
        String bol;
        System.out.println("Ingrese el valor de la compra: ");
        com = input.nextFloat();
        System.out.println("Ingrese el color de la bolita: ");
        bol = input.next();
        if (bol.equals("blanca")){
            System.out.println("El cliente debe pagar: $" + com);
        }
        else if (bol.equals("verde")){
            System.out.println("El cliente debe pagar: $" + (com*0.9));
        }
        else if (bol.equals("amarilla")){
            System.out.println("El cliente debe pagar: $" + (com*0.75));
        }
        else if (bol.equals("azul")){
            System.out.println("El cliente debe pagar: $" + (com*0.5));
        }
        else if (bol.equals("roja")){
            System.out.println("El cliente debe pagar: $0");  
        }
    }
}