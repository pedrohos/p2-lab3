import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.*;
import java.util.Random;

public class AgendaTest {

	private static Agenda agenda;
	private static Agenda agenda2;
	static Random gerador;
	
	@BeforeAll
	public static void criaAgenda() {
		agenda = new Agenda();
		agenda2 = new Agenda();
		gerador = new Random();
	}
	
	@Test
	public void testTodosEspacos() {
		for(int i = 0; i < 100; i++) {
			agenda.cadastrarContato(i + 1, "Carlos " + i, "Almeida " + i, Integer.toString(gerador.nextInt()));
		}
		for(int i = 0; i < 100; i++) {
			agenda.cadastrarContato(i + 1, "Carlos " + i, "Almeida " + i, Integer.toString(gerador.nextInt()));
		}
	}
	
	@Test
	public void testComparaAgenda() {
		for(int i = 0; i < 100; i++) {
			agenda.cadastrarContato(i + 1, "Rafael " + i, "Zilio " + i, Integer.toString(gerador.nextInt()));
		}
		for(int i = 0; i < 100; i++) {
			agenda2.cadastrarContato(i + 1, "Rafael " + i, "Zilio " + i, Integer.toString(gerador.nextInt()));
		}
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
