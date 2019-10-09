package br.edu.unifcv;

public class ContaCorrenteEspecial extends ContaCorrente {

	double saldo = 100;

	public double saqueEspecial(double valor) {
		saldo = saldo - valor - (valor * 0.1 / 100);

		return saldo;

	}
	public void saldoClienteEspecial() {
		System.out.println("Saldo cliente especial: " + saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
