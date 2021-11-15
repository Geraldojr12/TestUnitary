package entidades;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContaTest {

	Conta contaTeste;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BEFORE CLASS");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AFTER CLASS");
	}

	@Before
	public void setUp() throws Exception {
		contaTeste = new Conta();
		System.out.println("SETUP");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TEARDOWN");
	}

	@Test
	public void testGetSetAgencia() {
		System.out.println("TESTE GET SET AGENCIA");
		//MONTAGEM
		contaTeste.setAgencia("12345");
		
		//ACAO
		
		
		//TESTE
		assertEquals("12345", contaTeste.getAgencia());
	}
	
	@Test
	public void testGetSetConta() {
		System.out.println("TESTE GET SET CONTA");
		contaTeste.setConta("1111");
		assertEquals("1111", contaTeste.getConta());
	}
	
	@Test
	public void testGetSetUsuario() {
		Usuario junior = new Usuario("Junior");
		contaTeste.setUsuario(junior);
		assertEquals(junior, contaTeste.getUsuario());
	}
	
	@Test
	public void testGetSetDataAbertura() {
		//MONTAGEM
		Date dataAbertura = new Date(2021,11,8);
		
		//ACAO
		contaTeste.setDataAbertura(dataAbertura);
		
		
		//TESTE
		assertEquals(dataAbertura, contaTeste.getDataAbertura());
		
	}
	
	@Test
	public void testGetGetSetDataEncerramento() {
		//MONTAGEM
		Date dataEncerramento = new Date(2022,11,8);
		
		//ACAO
		contaTeste.setDataEncerramento(dataEncerramento);
		
		//TESTE
		assertEquals(dataEncerramento, contaTeste.getDataEncerramento());
	}
	
	@Test 
	public void testContaConstrutor() {
		Usuario junior = new Usuario("Junior");
		contaTeste = new Conta(junior, "1111", "2222", 200.00, new Date(2020, 11, 8));
		assertEquals(junior, contaTeste.getUsuario());
		assertEquals("1111", contaTeste.getAgencia());
		assertEquals("2222", contaTeste.getConta());
		assertEquals(200.00, contaTeste.getSaldo(), 0.01);
		assertEquals(new Date(2020, 11, 8), contaTeste.getDataAbertura());
	}
	
	
	
	

}
