package br.edu.unifcv;

public class ContaCorrente {

	private double saldo = 0;

	public double depositar(double valor) {
		return saldo = saldo + valor;

	}

	public double sacar(double valor) {
		saldo = saldo - valor - (valor * 0.5 / 100);

		return saldo;

	}

	public void obterSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

}
