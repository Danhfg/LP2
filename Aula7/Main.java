public class Main{
	public static void main(String [] args){
		Prova p11;
		Prova p12;
		Prova p21;
		Prova p22;
		Prova p31;
		Prova p32;
		p11 = new Prova(4, 2.5);
		p12 = new Prova(1, 7);
		p21 = new Prova(6.5, 3.5);
		p22 = new Prova(0, 3);
		p31 = new Prova(5, 4);
		p32 = new Prova(6, 1.5);
                
                Aluno a1;
                Aluno a2;
                Aluno a3;
                a1 = new Aluno(p11, p12);
                a2 = new Aluno(p21, p22);
                a3 = new Aluno(p31, p32);

                Turma t;
                t = new Turma(a1, a2, a3);

                double auxa1 = a1.calcularMedia();
                double auxa2 = a2.calcularMedia();
                double auxa3 = a3.calcularMedia();
                double aux = t.calcularMedia();
                
		System.out.println("Nota aluno1: "+auxa1+"\nNota aluno2: "+auxa2+"\nNota aluno3: "+auxa3+"\nMédia total da turma: "+aux);
	}
}
