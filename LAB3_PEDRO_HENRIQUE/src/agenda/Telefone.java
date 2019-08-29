package agenda;

public class Telefone {
	private String codigoDePais;
	private String ddd;
	private String numero;
	private int nivelDeAmizade;
	
	public Telefone(String codigoDePais, String ddd, String numero, int nivelDeAmizade) {
		
		if (codigoDePais.isEmpty()) {
			throw new IllegalArgumentException("O código de país está vazio.");
		}
		
		if (ddd.isEmpty()) {
			throw new IllegalArgumentException("O ddd está vazio.");
		}
		
		if (numero.isEmpty()) {
			throw new IllegalArgumentException("O número está vazio.");
		}
		
		if (codigoDePais.trim().equals("")) {
			throw new IllegalArgumentException("O código de país só possui espaços vazios.");
		}
		
		if (ddd.trim().equals("")) {
			throw new IllegalArgumentException("O ddd só possui espaços vazios.");
		}
		
		if (numero.trim().equals("")) {
			throw new IllegalArgumentException("O número só possui espaços vazios.");
		}
		
		if (nivelDeAmizade < 1 || nivelDeAmizade > 5) {
			throw new IllegalArgumentException("O nível de amizade não possui um valor aceitável.");
		}
		
		this.codigoDePais = codigoDePais;
		this.ddd = ddd;
		this.numero = numero;
		this.nivelDeAmizade = nivelDeAmizade;
	}
}
