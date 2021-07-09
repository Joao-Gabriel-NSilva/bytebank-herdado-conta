package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(11, 11);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
//		System.out.println(referencias[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
