package parte1;
import java.util.Scanner;
public class Cap4_Ejercicio11 {
    public static void main(String[] args)
    {
        int N1, N2, N3, Mayor;

        Scanner leer = new Scanner(System.in);

        /* Se piden los lados del triangulo */
        System.out.print("N1: ");
        N1 = leer.nextInt();

        System.out.print("N2: ");
        N2 = leer.nextInt();

        System.out.print("N3: ");
        N3 = leer.nextInt();

        if (N1 > N2 && N1 > N3)
        {
            Mayor = N1;
        }
        else
        {
            if (N2 > N3)
            {
                Mayor = N2;
            }
            else {
                Mayor = N3;
            }
        }
        System.out.println("EL VALOR MAYOR ENTRE: "+N1+ ", "+ N2+" Y "+ N3+ " ES: "+ Mayor);
    }
}