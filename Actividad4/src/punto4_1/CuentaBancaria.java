package poo.cuentasbancarias;

import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el saldo de la cuenta: ");
        float saldo = input.nextFloat();
        System.out.println("Ingrese la tasa anual de la cuenta: ");
        float TAnual = input.nextFloat();
        CuentaAhorros CA = new CuentaAhorros(saldo,TAnual);
        System.out.println("Ingrese el valor a consignar: ");
        float c = input.nextFloat();
        CA.Consignar(c);
        System.out.println("Ingrese el valor a retirar: ");
        float r = input.nextFloat();
        CA.Retirar(r);
        CA.Emensual();
        CA.Imprimir();
    }
}
