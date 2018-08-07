public class Credit{
	private int cred;

	public Credit (){
		cred = 1000;
	}

	public Credit (int valor){
		cred = valor;
	}

	public int getCred (){
		return cred;
	}

	public void setCred (int valor){
		cred = valor;
	}

	public void topUp (int valor){
		cred = cred + valor;
	}

	public void consumir(int valor){
		cred = cred - valor;
	}
}
