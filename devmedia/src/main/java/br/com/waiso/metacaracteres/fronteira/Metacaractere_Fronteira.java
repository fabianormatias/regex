package br.com.waiso.metacaracteres.fronteira;

public class Metacaractere_Fronteira {
	
	public static void main(String[] args) {
		// Começa na palavra Java, continua com qualquer caractere a partir do .
		// 0 e mais vezes
		boolean palavra = "Java322".matches("^Java.*");
		System.out.println(palavra);
		
		// Termina com 322 //O ponto (.) Começa com qualquer caractere e busca 0
		// ou mais caracteres finalizando com o num 322
		palavra = "Java322".matches(".*322$");
		System.out.println(palavra);
		
		// Pesquisa se uma palavra existe no texto
		palavra = "Hello World Java".matches(".*Java.*");
		System.out.println(palavra);
		
		// Pesquisa os caracteres que estão depois da letra O e antes da palavra
		// Java
		palavra = "O mundo Java".matches("^O.*Java$");
		System.out.println(palavra);
		
		// Pesquisa pela palavra Inter ou Grêmio
		boolean time = "Inter".matches("Inter|Grêmio");
		System.out.println("Time: " + time);
	}
}
