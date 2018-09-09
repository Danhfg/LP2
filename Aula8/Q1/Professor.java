public class Professor{
	private String nome;
	private String matricula;
	private int idade;
	
	public Professor(String n, String m, int i){
		nome = n;
		matricula = m;
		idade = i;
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		nome = n;
	}

        public String getMatricula(){
		return matricula;
        }
        public void setMatricula(String m){
		matricula = m;
        }

        public int getIdade(){
		return idade;
        }
        public void setIdade(int i){
		idade = i;
        }

}
