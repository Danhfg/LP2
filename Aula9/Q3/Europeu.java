import java.util.Random;

public class Europeu extends Castelo {
    protected int numPaladinos;
            
    public Europeu(double d, double l, double pdv, String n, int nP){
        super(d, l, pdv, n);
        numPaladinos = nP;
    }
    
    public void mostrarSituacao(){
        super.mostrarSituacao();
        System.out.println("Número de paladinos: " + numPaladinos);
    }
    
    public void ataque(double d){
        if(numPaladinos > 0){
            Random gerador = new Random();
            int rand = gerador.nextInt(4);
            rand += 2;
            numPaladinos -= rand;
            if (numPaladinos < 0){
                numPaladinos = 0;
            }
        }
        else{
            super.ataque(d);
        }
    }
}
