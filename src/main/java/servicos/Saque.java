package servicos;

import entidades.Conta;
import utils.APIConnection;
import utils.DatabaseConnection;

public class Saque {

	public void realizaSaque(Conta conta, Double valor) {
		if (possuiSaldo(conta, valor)){
			conta.setSaldo(conta.getSaldo()-valor);
		}
	}
	private boolean possuiSaldo(Conta conta, Double valor) {
		if(conta.getSaldo() >= valor) {
			return true;
		} else {
			return false;
		}
	}
}

 