package br.com.waiso.modificadores;

public class TestaMetacaractere {
	
	public static void main(String[] args) {
		boolean email = "@".matches(".");
		System.out.println("Qualquer caractere: " + email);
		
		boolean numero = numero = "a".matches("\\d");
		System.out.println("Possui número: " + numero);
		
		numero = "2".matches("\\d");
		System.out.println("Possui número: " + numero);
		
		boolean letrasNumeros = "A2".matches("\\w\\d");
		System.out.println("Possui letras e números? " + letrasNumeros);
		
		boolean espaco = " ".matches("\\s");
		System.out.println("Possui espaço? " + espaco);
	}
}