public class Main{
	public static void main(String [] args){
		ProfessorRegime dan = new ProfessorRegime("Daniel Henrique", "20202020", 20, 10000 );
		ProfessorHorista other = new ProfessorHorista("Daniel Henrique2", "020202", 20, 20, "100");

		System.out.println("Nome: " + dan.getNome() + "\nMatricula: " + dan.getMatricula() + "\nIdade: " + dan.getIdade() + "\nSalario: " + dan.getSalario());
		System.out.println("\nNome: " + other.getNome() +"\nMatricula: " + other.getMatricula() + "\nIdade: " + other.getIdade() + "\nSalario: "  + other.Salario());
	}
}
