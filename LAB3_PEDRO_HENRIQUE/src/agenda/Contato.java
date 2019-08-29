package agenda;

public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;
	
	private static void stringInvalida(String verificada, String nomeDaString) {
		if(verificada.isEmpty()) {
			throw new IllegalArgumentException("A string está " + nomeDaString + " vazia.");
		}
		
		boolean possuiCaracter = false;
		
		if (verificada.trim().equals("")) {
			throw new IllegalArgumentException("A string " + nomeDaString + " só possui espaços vazios.");
		}
		
	}
	
	public Contato(String nome, String sobrenome, String telefone) {
		if (nome == null) {
			throw new NullPointerException("O nome recebido é do tipo nulo.");
		} else if(sobrenome == null) {
			throw new NullPointerException("O sobrenome recebido é do tipo nulo.");
		} else if (telefone == null) {
			throw new NullPointerException("O telefone recebido é do tipo nulo.");
		}
		
		stringInvalida(nome, "nome");
		stringInvalida(sobrenome, "sobrenome");
		stringInvalida(telefone, "telefone");
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + " - " + this.telefone;
	}
}