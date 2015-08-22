package br.com.waiso.quantificadores;

public class TestaQuantificador {
	
	public static void main(String[] args) {
		
		// Procura 2 dígitos no texto
		boolean valor = "74".matches("\\d{2}");
		System.out.println(valor);
		
		// Procura mais de 2 dígitos no texto
		valor = "211".matches("\\d{9,}");
		System.out.println(valor);
		
		// Procura dígitos entre os valores de 2 e 5
		valor = "2121".matches("\\d{2,5}");
		System.out.println(valor);
		
		// Procura dígito entre 0 e 1 vezes
		valor = "22".matches(".?");
		System.out.println(valor);
		
		// Procura dígito entre 0 e mais vezes
		valor = "75411".matches(".*");
		System.out.println(valor);
		
		// Procura dígito entre 1 e mais vezes
		valor = "".matches(".+");
		System.out.println(valor);
		
		// Cria expressão regular resumida da data
		String data = "02/05/1995";
		valor = data.matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println("Data: " + valor);
		
		// Cria a expressão regular resumida do cep
		String cep = "8545-222";
		valor = cep.matches("\\d{4}-\\d{3}");
		System.out.println("Cep: " + valor);
	}
}
