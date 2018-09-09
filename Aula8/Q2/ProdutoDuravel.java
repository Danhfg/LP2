import java.util.Date;

public class ProdutoDuravel extends Produto{
	private String materialPred;
	private String durabilidade;

	public ProdutoDuravel(String n, double p, String m, String d, Date data, String mP, String dur){
		super(n, p, m, d, data);
		materialPred = mP;
		durabilidade = dur;
	}

	public String getMaterialPred(){
		return materialPred;
	}
	public void setMaterialPred(String m){
		materialPred = m;
	}

        public String getDurabilidade(){
		return durabilidade;
        }
        public void setDurabilidade(String dur){
		durabilidade = dur;
        }
}
