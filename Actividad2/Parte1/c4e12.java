import java.util.Scanner;
public class c4e12 {

    public static void main(String[] args) {
        int NHT, VHN, HET, HEE8, SALARIO;
        String NOM;

        System.out.println("Ingrese el nombre del trabajador");
        Scanner nom = new Scanner(System.in);
        NOM= nom.nextLine();

        System.out.println("Ingrese el numero de horas trabajadas");
        Scanner nht = new Scanner(System.in);
        NHT= nht.nextInt();

        System.out.println("Ingrese el valor por hora trabajada");
        Scanner vhn = new Scanner(System.in);
        VHN= vhn.nextInt();

        if(NHT>40){
            HET=NHT-40;
            if(HET>8){
                HEE8=HET-8;
                SALARIO=(40*VHN)+(16*VHN)+(HEE8*3*VHN);
            }
            else{
                SALARIO=(40*VHN)+(HET*2*VHN);
            }
        }
        else{
            SALARIO=NHT*VHN;
        }
        System.out.println("El trabajador "+NOM+" devengo: $"+SALARIO);


    }
}
