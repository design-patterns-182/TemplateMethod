package br.com.studiotrek;

public abstract class Conta {

	private Double saldo = 0.0;
	
	public void depositar(Double valor) {
		this.saldo += valor;
		this.saldo -= this.calcularTaxa();
	}
	
	public void sacar(Double valor) {
		this.saldo -= valor;
		this.saldo -= this.calcularTaxa();
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public abstract Double calcularTaxa();
}
