package br.com.studiotrek;

public class Main {

	public static void main(String[] args) {
		
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.depositar(100.0);
		contaCorrente.sacar(10.0);
		
		contaPoupanca.depositar(100.0);
		contaPoupanca.sacar(10.0);
		
		System.out.println(contaCorrente.toString());
		System.out.println(contaPoupanca.toString());
	}
	
}
