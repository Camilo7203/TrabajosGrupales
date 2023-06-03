package poo.cuentasbancarias;

public class CuentaAhorros extends Cuenta{
    private boolean activ;
    
    public CuentaAhorros(float saldo, float TAnual){
        super(saldo,TAnual);
        if (saldo < 10000){ //Comprobar si la cuenta se considera activa o inactiva
            activ = false;
        }
        else{
            activ = true;
        }
    }
    
    public void Consignar(float cant){
        if (activ){                 //Comprobar la actividad de la cuenta
            super.Consignar(cant);  //Consignar el valor a la cuenta activa
        }
        else{
            System.out.println("No es posible: cuenta inactiva");
        }
    }
    
    public void Retirar(float cant){
        if (activ){                 //Comprobar la actividad de la cuneta
            super.Retirar(cant);    //Se llama al método de retirar
        }
        else{
            System.out.println("No es posible: cuenta inactiva");
        }
    }
    
    public void Emensual(){
        if (NumRetiros > 4){                            //Se comprueban la cantidad de retiros
            Comisionm = 1000*(super.NumRetiros - 4);    //Se suman $1000 por cada retiro después del 4º   
        }
        super.EMensual();                               //Se calcula y aplica el extracto mensual
        if (saldo < 10000){                             //Comprobar la actividad de la cuenta después del extracto
            activ = false;                              //Inactivar la cuenta en tal caso
        }
    }
    
    public void Imprimir(){
        System.out.println("Saldo:                     $" + saldo);
        System.out.println("Comisión mensual:          $" + Comisionm);
        System.out.println("Número de transacciones:    " + (NumConsig + NumRetiros));
    }
}
