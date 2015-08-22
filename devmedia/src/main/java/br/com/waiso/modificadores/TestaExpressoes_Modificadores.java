package br.com.waiso.modificadores;

public class TestaExpressoes_Modificadores {
	
	public static void main(String[] args) {
		String palavra = "Silveira";
		boolean sobreNome = palavra.matches("(?i)silveira");
		System.out.println("Retorno = " + sobreNome);
	}
	
}