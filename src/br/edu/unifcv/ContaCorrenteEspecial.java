package br.edu.unifcv;

public class ContaCorrenteEspecial extends ContaCorrente {

	double saldo;

	public double saqueEspecial(double valor) {
		saldo = saldo - valor - (valor * 0.1 / 100);

		return saldo;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
