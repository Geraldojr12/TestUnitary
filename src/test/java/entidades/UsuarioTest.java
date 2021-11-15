package entidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void instanciaUsuarioTest() {
		Usuario junior = new Usuario();
		
	}
	
	@Test
	public void instanciaUsuarioStringTest() {
		Usuario junior = new Usuario("Junior");
	}

	@Test
	public void usuarioGetSetTest() {
		Usuario junior = new Usuario();
		junior.setNome("Junior");
		assertEquals("Junior", junior.getNome());
	}
	
	@Test
	public void assertivasTest() {
		assertTrue(true);
		assertFalse(false);
		Usuario junior = new Usuario("Junior");
		Usuario junior2 = junior;  
		Usuario junior3 = new Usuario("Junior");
		assertSame(junior, junior2);
		assertNotSame(junior3, junior);
		int x = 10;
		Integer y = 10;
		
	}
}
