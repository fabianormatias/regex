package br.com.waiso.modificadores;

public class TestaOcorrencias {
	
	public static void main(String[] args) {

		// Procura a ocorrencia de 1 caractere
		boolean caractere = "E".matches(".");
		System.out.println(caractere);

		// Procura a ocorrência de 2 caracteres
		caractere = "Ab".matches("..");
		System.out.println(caractere);

		// Validação de cep
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		boolean valida = "99855-000".matches(cep);
		System.out.println(valida);
	}
}
