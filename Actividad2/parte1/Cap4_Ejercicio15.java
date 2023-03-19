package parte1;
import java.util.Scanner;

public class Cap4_Ejercicio15 {
    public static void main(String[] args){
        int A, B, C, D;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        A = input.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        B = input.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        C = input.nextInt();
        System.out.print("Ingrese el peso de la esfera D: ");
        D = input.nextInt();

        if ((A == B) && (A == C)){
            if (D > A){
                System.out.print("La esfera D es la Diferente y");
            } else {
                System.out.print("La esfera D es la Diferente y");
            }
        } else {
            if ((A == B) && (A == D)){
                System.out.print("La esfera C es la Diferente y");
                if (C > A){
                    System.out.println(" es de mayor peso");
                } else {
                    System.out.println(" es de menor peso");
                }
            } else {
                if ((A == C) && (A == D)){
                    System.out.print("La esfera B es la Diferente y");
                    if (B > D){
                        System.out.println(" es de mayor peso");
                    } else {
                        System.out.println(" es de menor peso");
                    }
                } else {
                    System.out.print("La esfera A es la Diferente y");
                    if (A > B){
                        System.out.println(" es de mayor peso");
                    } else {
                        System.out.println(" es de mayor peso");
                    }
                }
            }
        }
        input.close();
    }
}