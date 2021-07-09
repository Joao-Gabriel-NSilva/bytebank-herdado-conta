package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "   Alura   ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);

		String nome = "Alura";
		// String nome = new String("Alura);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		System.out.println(nome.indexOf("ur"));
		
//		System.out.println(nome.substring(1));

//		char c = nome.charAt(0);
//		System.out.println(c);

//		char c = 'A';
//		char d = 'a';

//		String outra = nome.replace(c, d);
//		String outro = nome.toLowerCase();

//		System.out.println(nome);
//		System.out.println(outro);

	}

}
