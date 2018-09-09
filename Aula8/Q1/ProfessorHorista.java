public class ProfessorHorista extends Professor{
	private int total_horas;
	private String salario_hora;

	public ProfessorHorista(String n, String m, int i, int t_h, String s){
		super(n, m, i);
		total_horas = t_h;
		salario_hora = s;
	}

	public int getTotal_horas(){
		return total_horas;
	}
	public void setTotal_horas(int t_h){
		total_horas = t_h;
	}

        public String getSalario_hora(){
		return salario_hora;
        }
        public void setSalario_hora(String s){
		salario_hora = s;
        }

	public double Salario(){
		return total_horas * Double.parseDouble(salario_hora);
	}

}
