package br.com.GTBanck.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String vazio = "     Alura    ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		String nome = "Alura";
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
