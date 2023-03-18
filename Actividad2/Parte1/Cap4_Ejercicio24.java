import java.util.Scanner;

public class Cap4_Ejercicio24{
    public static void main(String[] args) {
        boolean a_MayorQue_B,a_MayorQue_C,b_MayorQue_c;
        Scanner input = new Scanner (System.in);

        System.out.print("Para este ejercicio haremos preguntas para obtener informacion acerca del peso de las esferas");
        System.out.println("Para responder se debe hacer como 'true' o 'false'");

        System.out.print("Pregunta Uno: ¿es la esfera A más pesada que la B? (true, false): ");
        a_MayorQue_B = input.nextBoolean();

        System.out.print("Pregunta Dos ¿es la esfera A más pesada que la C? (true, false): ");
        a_MayorQue_C = input.nextBoolean();

        System.out.print("Pregunta Tres ¿es la esfera B más pesada que la C? (true, false): ");
        b_MayorQue_c = input.nextBoolean();

        input.close();

        if(a_MayorQue_B){
            if (a_MayorQue_C
            ) {
                System.out.println ("la esfera A es la más grande");
            }else{
                System.out.println ("la esfera C es la más grande");
            }
        }else{
            if(b_MayorQue_c){
                System.out.println ("la esfera B es la más grande");
            }else{
                System.out.println ("la esfera C es la más grande");
            }
        }
    }
}