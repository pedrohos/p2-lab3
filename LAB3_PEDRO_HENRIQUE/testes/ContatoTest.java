import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import agenda.Contato;

public class ContatoTest {
	
	@Test
	public void testNomeNull() {
		try {
			Contato contatoNulo =  new Contato(null, "Silva", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void testSobreNomeNull() {
		try {
			Contato contatoNulo =  new Contato("Carlos", null, "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void testTelefoneNull() {
		try {
			Contato contatoNulo =  new Contato("Carlos", "Silva", null);
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void testNomeVazio() {
		try {
			Contato contatoVazio =  new Contato("", "Silva", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testSobreNomeVazio() {
		try {
			Contato contatoVazio =  new Contato("Carlos", "", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testTelefoneVazio() {
		try {
			Contato contatoVazio =  new Contato("Carlos", "Silva", "");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testNomeEspacosVazios() {
		try {
			Contato contatoInvalido =  new Contato("    ", "Silva", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testSobreNomeEspacosVazios() {
		try {
			Contato contatoInvalido =  new Contato("Carlos", "  ", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testTelefoneEspacosVazios() {
		try {
			Contato contatoInvalido =  new Contato("Carlos", "Silva", "    ");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}

}
