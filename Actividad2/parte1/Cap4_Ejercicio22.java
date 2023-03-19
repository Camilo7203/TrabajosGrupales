package parte1;
import java.util.Scanner;
public class Cap4_Ejercicio22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor, horas, salarioMensual;
        String nombre;

        System.out.println("Ingrese el nombre:");
        nombre = input.nextLine();

        System.out.println("Ingrese el salario por hora de "+ nombre);
        valor = input.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas");
        horas = input.nextDouble();


        salarioMensual = valor*horas;

        if (salarioMensual>450000) {
            System.out.println("Nombre: "+nombre+". Salario: "+salarioMensual);
        }
        else {
            System.out.println("Nombre: "+nombre);
        }
    }
}
