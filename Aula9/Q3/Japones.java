import java.util.Random;

public class Japones extends Castelo {
    protected int numSamurais;
    
    public Japones(double d, double l, double pdv, String n, int nS){
        super(d, l, pdv, n);
        numSamurais = nS;
    }
        
    public void mostrarSituacao(){
        super.mostrarSituacao();
        System.out.println("Número de Samurais: " + numSamurais);
    }
    
    public void ataque(double d){
        if(numSamurais > 0){
            Random gerador = new Random();
            int rand = gerador.nextInt(4);
            rand += 2;
            numSamurais -= rand;
            if (numSamurais < 0){
                numSamurais = 0;
            }
        }
        else{
            super.ataque(d);
        }
    }
}
