
import java.io.BufferedReader;
	import java.io.InputStreamReader;


public class area {
	public static void main (String args []) throws Exception {
	
		//Declaração de variaveis
		double nota = 0;
		double somaNotas = 0;
		double qtdeAlunos = 0;
		double Media = 0;
		String leitor = "";
		
		//Processamento de dados
		do {
			System.out.print("Digite uma nota");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();;
		nota =  Double.parseDouble(leitor);
		
		
		somaNotas = somaNotas + nota;
		qtdeAlunos++;

		System.out.print("Tem mais aluno <s/n>");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();;
		
		
		} while (leitor.equals("s"));
		
		//Processamento
		Media = somaNotas / qtdeAlunos;
		
	//Saida de dados 
		
	System.out.print("A media dos alunos é: " + Media);
	
	}
	
}

