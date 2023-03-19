import java.util.Scanner;
public class Cap3_Ejercicio18 {

    public static void main(String[] args) {
        String empID, nombre;
        double horas, valorHora, impuesto, resta, salarioBruto, salarioNeto;

        Scanner imput = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = imput.next();

        System.out.println("Ingrese la ID del trabajador:");
        empID = imput.next();

        System.out.println("Ingrese cuantas horas trabajo:");
        horas = imput.nextDouble();

        System.out.println("Ingrese cuanto cobra por hora?:");
        valorHora = imput.nextDouble();

        System.out.println("Ingrese en porcentaje cual es el valor de la retencion en la fuente:");
        impuesto = imput.nextDouble();

        salarioBruto = horas * valorHora;

        resta = salarioBruto * (impuesto / 100);
        salarioNeto = salarioBruto - resta;

        System.out.println("ID: " + empID + ". " + nombre + ". Salario bruto: " + salarioBruto + ". Salario neto: " + salarioNeto);
    }
}
