import java.util.Date;

public class Produto{
	private String nome;
	private double preco;
	private String marca;
	private String desc;
	private Date data_de_fabr;

	public Produto(String n, double p, String m, String d, Date d_d_f){
		nome = n;
		preco = p;
		marca = m;
		desc = d;
		data_de_fabr = d_d_f;
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		nome = n;
	}

        public double getPreco(){
		return preco;
        }
        public void setPreco(double p){
		preco = p;
        }

        public String getMarca(){
		return marca;
        }
        public void setMarca(String m){
		marca = m;
        }

        public String getDesc(){
		return desc;
        }
        public void setDesc(String d){
		desc = d;
        }

        public Date getData_de_fabr(){
		return data_de_fabr;
        }
        public void setData_de_fabr(Date d_d_f){
		data_de_fabr = d_d_f;
        }

}
