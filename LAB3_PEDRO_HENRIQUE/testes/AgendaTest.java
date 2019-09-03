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
		System.out.println(agenda.listarContatos());
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
	public void testDiferentesPosicoes() {
		agenda.cadastrarContato(10, "Carlos", "Souza", "9845");
		agenda.cadastrarContato(31, "Henrique", "Almeida", "4612");
		agenda2.cadastrarContato(20, "Carlos", "Souza", "9741");
		agenda2.cadastrarContato(31, "Henrique", "Almeida", "3241");
		assertFalse(agenda.equals(agenda2));
	}
	
	@Test
	public void testListaContatos() {
		agenda = new Agenda();
		agenda.cadastrarContato(10, "Carlos", "Souza", "9845");
		agenda.cadastrarContato(31, "Henrique", "Almeida", "4612");
		assertEquals(agenda.listarContatos(), "10 - Carlos Souza\n" +
											  "31 - Henrique Almeida\n");
	}
	
	@Test
	public void testPesquisaContato() {
		agenda = new Agenda();
		
	}
}
