package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {
		
		
		//Conta Corrente normal
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(60);
		cc.sacar(30);
		cc.obterSaldo();
		cc.getSaldo();
		
		
		//Conta Corrente do Cliente Especial
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial();
		cce.depositar(70);
		cce.saqueEspecial(10);
		cce.obterSaldo();
		cce.getSaldo();
	}

}
