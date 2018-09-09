public class ProfessorRegime extends Professor{
	private double salario;
	
	public ProfessorRegime(String n, String m, int i, double s){
		super(n, m, i);
		salario = s;
	}

	public double getSalario(){
		return salario;
	}
	public void setSalario(double s){
		salario = s;
	}
}
