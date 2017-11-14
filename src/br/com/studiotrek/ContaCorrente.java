package br.com.studiotrek;

public class ContaCorrente extends Conta {

	@Override
	public Double calcularTaxa() {
		return 3.0;
	}
	
	@Override
	public String toString() {
		return "Saldo da Conta Corrente: " + getSaldo();
	}
	
}
