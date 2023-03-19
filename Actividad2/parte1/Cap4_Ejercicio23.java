package parte1;

import java.util.Scanner;
public class Cap4_Ejercicio23 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double A,B,C,d,s1,s2;
         System.out.println("Ecuación cuadrática de la forma Ax²+Bx+C=0");
         System.out.println("Ingrese el valor de A: ");
         A = input.nextDouble();
         System.out.println("Ingrese el valor de B: ");
         B = input.nextDouble();
         d = Math.pow(B, 2);
         System.out.println("Ingrese el valor de C: ");
         C = input.nextDouble();
         s1 = (-B + Math.sqrt(d -(4*A*C)))/(2*A);
         s2 = (-B - Math.sqrt(d -(4*A*C)))/(2*A);
         if ((d -(4*A*C)) >= 0){
             System.out.println("Las soluciones de la ecuación son: x=" + s1 + " y x=" +s2);
         }
         else {
             System.out.println("Es posible que las soluciones de la ecuación no sean reales");
         }
    }
}
