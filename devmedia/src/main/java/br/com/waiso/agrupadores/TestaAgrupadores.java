package br.com.waiso.agrupadores;

public class TestaAgrupadores {
	
	public static void main(String[] args) {
		// Busca qualquer letra de a até z - faz diferença utilizar maiúsculas e
		// minúsuculas
		boolean palavra = "g".matches("[a-z]");
		System.out.println(palavra);
		
		// Verifica se foi escrita em letra maiúscula ou minúscula
		palavra = "Java".matches("[jJ]ava");
		System.out.println(palavra);
		
		// Verifica caracteres de A até Z e a até z
		palavra = "Sql".matches("[A-Z][a-z]*");
		System.out.println(palavra);
		
		// Não permite que comece com as letras a e i
		palavra = "Oracle".matches("[^aei]racle");
		System.out.println(palavra);
		
		// Verifica se foi digitado o caractere "j" e "s"
		// Retorna false por causa da letra "z" onde que o padrão esperava a letra "s"
		palavra = "Objetoz".matches("Ob[j]eto[s]");
		System.out.println(palavra);
		
		// Validação de email
		boolean email = "java@teste.com.br".matches("\\w+@\\w+\\.\\w{2,3}\\.\\w{2,3}");
		System.out.println(email);
	}
}
