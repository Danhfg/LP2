public class Prova{
    private double notaParte1;
    private double notaParte2;

	public Prova()
	{
        notaParte1 = 0;
        notaParte2 = 0;
	}
	public Prova(double n1, double n2)
	{
        notaParte1 = n1;
        notaParte2 = n2;
	}

	public double calcularNotaTotal()
	{
        double aux = notaParte1 + notaParte2;
        if (aux>10)
            return 10;
        return aux;
	}
}
