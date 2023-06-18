package Notas;

public class Notas {
    Double[] notas;
    
    public Notas(){
        notas = new Double[5];
    }
    
    public double promedio(){
        double sum = 0;
        for (int i = 0; i < notas.length;i++){
            sum += notas[i];
        }
        return sum/notas.length;
    }
    
    public double desviacion(){
        double prom = promedio(), sum = 0;
        for (int i= 0; i < notas.length;i++){
            sum = Math.pow((notas[i] - prom), 2);
        }
        sum = Math.sqrt(sum);
        return sum/notas.length;
    }
    
    public double mayor(){
        double M = 0;
        for(int i = 0; i < notas.length; i++){
            if (notas[i] > M){
                M = notas[i];
            }
        }
        return M;
    }
    
    public double menor(){
        double m = 100;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] < m){
                m = notas[i];
            }
        }
        return m;
    }
}
