public class Castelo{
    protected double defesas;
    protected double localizacao;
    protected double pontos_de_vida;
    protected String nome;
    
    public Castelo(double d, double l, double pdv, String n){
        defesas = d;
        localizacao = l;
        pontos_de_vida = pdv;
        nome = n;
    }
    
    public void mostrarSituacao(){
        if(pontos_de_vida <= 0){
            System.out.println("CASTELO DESTRUÍDO !!!!\n");
        }
        System.out.println("Nome: " + nome +"\nDefesas: " + defesas + "\nLocalização: " + localizacao + "\nPontos de vida: " + pontos_de_vida);
    }
    
    public void ataque(double d){
        if (defesas >= 0){
            defesas -= d;
        }
        else
            pontos_de_vida -= d;

        if (defesas < 0){
            pontos_de_vida -= defesas;
            defesas = 0;
        }
    }
}
