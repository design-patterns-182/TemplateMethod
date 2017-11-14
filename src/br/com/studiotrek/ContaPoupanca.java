package br.com.studiotrek;

public class ContaPoupanca extends Conta {

	@Override
	public Double calcularTaxa() {
		return 1.0;
	}

	@Override
	public String toString() {
		return "Saldo da Conta Poupança: " + getSaldo();
	}
	
}
