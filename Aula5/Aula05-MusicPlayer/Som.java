import java.util.ArrayList;

public class Som(){
	private ArrayList<String> lista;
	public Som(){
		lista = new ArrayList<String>();
	}

	void addFile(String file){ 
		lista.add(file);
	}
	
	int getNumberOfFiles(){
		return lista.size();	
	}

	void listFiles(){
//		int cont = 0;
		for (int cont = 0; cont < this.getNumverOfFiles(); cont++)
		{
			System.out.println(cont + ": " + lista[cont]);
		}
	}

	void removeFile(int pos){
		if (pos < this.getNumverOfFiles() and pos >=0)
		{
			lista.remove(pos);
		}
		else
		{
			System.out.println("ERRO: Index out of range!");
		}
	}

	void playFile(String file){
		SoundEngine se;
		se = new SoundEngine();
		se.playCompletely(file);
	}

	void playAll(){
		SoundEngine se;
		se = new SoundEngine();

		for (String s: lista)
		{
			se.playCompletely(s);
		}
	}

	void removeFile(String file){	
		boolean test = false;
		for (String s: lista)
                {
			if(s.contains(file) and test == false)
			{
				lista.remove(file);
			}
		}
	}
} 
