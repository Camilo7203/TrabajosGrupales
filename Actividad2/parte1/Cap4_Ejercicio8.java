package parte1;
import java.util.Scanner;
public class Cap4_Ejercicio8 {

    public static void main(String[] args) {
        double A, B;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor A: ");
        A = entrada.nextDouble();

        System.out.println("ingrese el valor B: ");
        B = entrada.nextDouble();

        if (A > B) {
            System.out.println("El valor " + A + " es mayor que " + B);
        }
        else {
            System.out.println("El valor " + B + " es mayor que " + A);
        }

    }

}
