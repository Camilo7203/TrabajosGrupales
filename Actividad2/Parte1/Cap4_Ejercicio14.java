import java.util.Scanner;

public class Cap4_Ejercicio14 {
    public static void main(String[] args){
        double VD1,VD2,VD3,salar,totVen,porVen,salar1,salar2,salar3;

        Scanner leer = new Scanner(System.in);


        System.out.print("ingrese ventas departamento 1: ");
        VD1=leer.nextDouble();

        System.out.print("ingrese ventas departamento 2: ");
        VD2=leer.nextDouble();

        System.out.print("ingrese ventas departamento 3: ");
        VD3=leer.nextDouble();

        System.out.print("ingrese el salario: ");
        salar=leer.nextDouble();

        leer.close();

        totVen=VD1+VD2+VD3;
        porVen=0.33*totVen;

        if (VD1>porVen) {
            salar1=salar+(0.2*salar);
        } else {
            salar1=salar;
        }

        if (VD2>porVen) {
            salar2=salar+(0.2*salar);
        } else {
            salar2=salar;
        }

        if (VD3>porVen) {
            salar3=salar+(0.2*salar);
        } else {
            salar3=salar;
        }

        System.out.println("salario vendedores depto 1 $"+salar1+", salario vendedores depto 2 $"+salar2+", salario vendedores depto 3 $"+salar3);
    }
}