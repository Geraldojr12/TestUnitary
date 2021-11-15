package servicos;

import entidades.Conta;

public class Transferencia {

	public int transferenciaMesmoBanco(Conta contaEnvia, Conta ContaRecebe, Double valor) {
		if (contaEnvia.getSaldo() < valor) {
			System.out.println("Valor insuficiente");
			return 1;
		}

		contaEnvia.setSaldo(contaEnvia.getSaldo() - valor);
		ContaRecebe.setSaldo(ContaRecebe.getSaldo() + valor);
		return 0;
	}
}