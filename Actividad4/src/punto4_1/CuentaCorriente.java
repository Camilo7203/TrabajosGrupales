package poo.cuentasbancarias;

public class CuentaCorriente extends Cuenta{
    float sobre;
    
    public CuentaCorriente(float saldo, float TAnual){
        super(saldo, TAnual);
        sobre = 0;              //Se inicializa el sobregiro en 0
    }
    
    public void Retirar(float cant){
        if (cant > saldo){              //Se comprueba la cantidad a retirar excede el saldo
            saldo = 0;                  //En ese caso el saldo queda en 0s
            sobre -= (saldo - cant);    //Y al sobregiro se le suma la cantidad que se excede al saldo
        }
        else{
            super.Retirar(cant);        //Si no excede el saldo, se efectua un retiro normal
        }
    }
    
    public void Consignar(float cant){
        if (sobre > 0){                     //Comprobar si hay sobregiro
            if (cant >= sobre){             //Comprobar si la cantidad consignada es mayor que el sobregiro
                saldo += (cant - sobre);    //Al saldo se le suma la diferencia entre la cantidad y el sobregiro
                sobre = 0;                  //El sobregiro se restablece a 0
            }
            else{                           //Si la cantidad es menor que el sobregiro
                sobre -= cant;              //Solo restar del sobregiro la cantidad consignada
            }
        }
        else{                               //Si no hay sobregiro
            super.Consignar(cant);          //Se recurre a una consignación normal
        }
    }
    public void EMensual(){
        super.EMensual();   //Extracto mensual de una cuenta
    }
    
    public void Imprimir(){
        System.out.println("Saldo:                     $" + saldo);
        System.out.println("Comisión mensual:           " + Comisionm);
        System.out.println("Número de transacciones:    " + (NumConsig + NumRetiros));
        System.out.println("Sobregiro:                 $" + sobre);
    }
}
