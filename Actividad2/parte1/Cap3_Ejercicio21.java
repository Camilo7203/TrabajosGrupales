package parte1;
import java.util.Scanner;

public class Cap3_Ejercicio21 {
    public static void main(String[] args) {
        double lado1, lado2, lado3, perimetro, semiperimetro, area, heron;
        Scanner leer = new Scanner(System.in);

        System.out.print("El lado 1: ");
        lado1 = leer.nextDouble();

        System.out.print("El lado 2: ");
        lado2 = leer.nextDouble();

        System.out.print("El lado 3: ");
        lado3 = leer.nextDouble();

        perimetro = lado1+lado2+lado3;

        semiperimetro = perimetro/2;

        heron = semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3);

        area = Math.sqrt(heron);

        System.out.println("El perimetro es = "+perimetro+" metros");
        System.out.println("El semiperimetro es = "+semiperimetro+" metros");
        System.out.println("El area es = "+area+" metros cuadrados");
    }
}