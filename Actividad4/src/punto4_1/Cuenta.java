package poo.cuentasbancarias;

public class Cuenta {
    protected int NumConsig = 0, NumRetiros = 0;
    protected float saldo, TAnual, Comisionm = 0;
    
    public Cuenta(float saldo,float TAnual){
        this.saldo = saldo;
        this.TAnual = TAnual;
    }
    
    public void Consignar(float cant){
        saldo += cant;      // Añadir la cantidad conignada a la cuenta
        NumConsig += 1;     // Aumentar en 1 la cantidad de consignaciones
    }
    
    public void Retirar(float cant){
        if (saldo > 0){         //Comprobar si se tiene saldo disponible
            if (cant <= saldo){ //Comprobar si lo que se va a retirar está permitido
                saldo -= cant;  //Actualizar el saldo
                NumRetiros += 1;//Actualizar el Numero de retiros
            }
            else{
                System.out.println("Fondos insuficientes");
            }
        }
        else{
            System.out.println("No tienes saldo disponible");
        }
    }
    
    public void CalcInteres(){
        float TMensual = TAnual/12; //Calcular el interés mensual
        saldo += saldo*TMensual;    //Aplicar el interés
    }
    
    public void EMensual(){
        saldo -= Comisionm;         //Aplicar el extracto mensual
        CalcInteres();              //Calcular los intereses con el nuevo saldo
    }
    
    public void Imprimir(){
        System.out.println("Saldo:                     $" + saldo);
        System.out.println("Número de consignaciones:   " + NumConsig);
        System.out.println("Número de retiros:          " + NumRetiros);
        System.out.println("Tasa anual:                 " + TAnual);
        System.out.println("Comisión mensual:          $" + Comisionm);
    }
}
