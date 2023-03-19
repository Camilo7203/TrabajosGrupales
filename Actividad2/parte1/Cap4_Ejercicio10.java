package parte1;

import java.util.Scanner;
public class Cap4_Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Nombre, No_I;
        double Pat, PagMat;
        byte Es;
        System.out.println("Ingrese el número de inscripción: ");
        No_I = input.next();
        System.out.println("Ingrese el nombre: ");
        Nombre = input.next();
        System.out.println("Ingrese el patrimonio: ");
        Pat = input.nextDouble();
        System.out.println("Ingrese el estrato: ");
        Es = input.nextByte();
        PagMat = 50000;
        if ((Pat > 2000000) && (Es > 3)) ;
            PagMat += (0.03*Pat);
        System.out.println("El estudiante con número de inscripión " + No_I + " y nombre " + Nombre + " debe pagar: $" + PagMat);
    }    
}
