package servicos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import entidades.Conta;
import entidades.Usuario;
import utils.APIConnection;
import utils.DatabaseConnection;

public class SaqueTest {

	@Test
	public void testRealizaSaque() {

		Usuario junior = new Usuario("Junior");
		Conta contaJunior = new Conta();
		contaJunior.setUsuario(junior);
		contaJunior.setAgencia("123456");
		contaJunior.setSaldo(1000.00);

		Saque saqueJunior = new Saque();

		saqueJunior.realizaSaque(contaJunior, 50.00);

		assertEquals(950.00, contaJunior.getSaldo(), 0.01);
	}

	@Test
	public void testRealizaSaldoInsuficiente() {

		Usuario junior = new Usuario("Junior");
		Conta contaJunior = new Conta();
		contaJunior.setUsuario(junior);
		contaJunior.setAgencia("123456");
		contaJunior.setSaldo(1000.00);
		Saque saqueJunior = new Saque();


		saqueJunior.realizaSaque(contaJunior, 1050.00);

		assertEquals(1000.00, contaJunior.getSaldo(), 0.01);
	}

}