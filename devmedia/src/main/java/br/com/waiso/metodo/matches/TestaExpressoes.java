package br.com.waiso.metodo.matches;

public class TestaExpressoes {

	public static void main(String[] args) {
		String palavra = "Maria";
		boolean nome = palavra.matches("Maria");
		System.out.println("Retorno = " + nome);
	}

}