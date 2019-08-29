
import java.io.BufferedReader;
	import java.io.InputStreamReader;



	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	
	public class pesomedio {
	public static void peso (String args []) throws Exception {
	
		//Declaração de variaveis
		double peso = 0;
		double somaPesos = 0;
		double qtdePessoas = 0;
		double pesoMedio = 0;
		String leitor = "";
		
		//Processamento de dados
		do {
			System.out.print("Digite o peso");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();;
		peso =  Double.parseDouble(leitor);
		
		
		pesoMedio = somaPesos + peso;
		qtdePessoas++;

		System.out.print("Tem mais gente? <s/n>");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();;
		
		
		} while (leitor.equals("s"));
		
		//Processamento
		pesoMedio = somaPesos / qtdePessoas;
		
	//Saida de dados 
		
	System.out.print("A media dos pesos é: " + pesoMedio);
	
	}
	
}





public class pesomedio {

}
