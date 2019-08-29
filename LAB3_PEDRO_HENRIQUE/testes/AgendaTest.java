import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.*;

public class AgendaTest {

	private Agenda agenda;
	private Agenda agenda2;
	
	@BeforeAll
	public void criaAgenda() {
		agenda = new Agenda();
		agenda2 = new Agenda();
	}
	
	@Test
	public void test() {
		agenda.cadastrarContato(1, "a", "b", "as");
		agenda2.cadastrarContato(1, "a", "b", "tf");
		assertEquals(agenda, agenda2);
	}
	
	@Test
	public void testNomeNull() {
		try {
			Contato contatoInvalido =  new Contato(null, "Silva", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void testSobreNomeNull() {
		try {
			Contato contatoInvalido =  new Contato("Carlos", null, "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void testTelefoneNull() {
		try {
			Contato contatoInvalido =  new Contato("Carlos", "Silva", null);
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void testNomeVazio() {
		try {
			Contato contatoInvalido =  new Contato("", "Silva", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testSobreNomeVazio() {
		try {
			Contato contatoInvalido =  new Contato("Carlos", "", "2456520");
			fail("Era esperado um uma exceção de entrada nula.");
		} catch (IllegalArgumentException iae) {
			
		}
	}
	
	@Test
	public void testTelefoneVazio() {
		try {
			Contato contatoInvalido =  new Contato("Carlos", "Silva", "");
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
