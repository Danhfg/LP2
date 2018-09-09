import java.util.Date;

public class ProdutoNaoDuravel extends Produto{
	private Date data_de_val;
	private String genero;

	public ProdutoNaoDuravel(String n, double p, String m, String d, Date data, Date data_val, String gen){
		super(n, p, m, d, data);
		data_de_val = data_val;
		genero = gen;
	}

	public Date getData_de_val(){
		return data_de_val;
	}
	public void setData_de_val(Date data){
		data_de_val = data;
	}

        public String getGenero(){
		return genero;
	}
        public void setGenero( String g){
		genero = g;
	}
	
}
