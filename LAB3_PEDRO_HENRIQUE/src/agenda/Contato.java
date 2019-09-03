package agenda;

/**
 * Representa um contato, este possui um nome, sobrenome e um telefone.
 * 
 * @author Pedro Silva
 */
public class Contato {
	
	/**
	 * É o nome do contato,
	 */
	private String nome;
	
	/**
	 * É o sobrenome do contato.
	 */
	private String sobrenome;
	
	/**
	 * É o telefone do contato.
	 */
	private String telefone;
	
	/**
	 * Verifica se a string recebida está vazia ou se só possui espaços vazios,
	 * caso sim, será lançado um IllegalArgumentException apontando o erro. 
	 * 
	 * @param verificada é a string a ser verificada.
	 * @param nomeDaString é o nome da variável que irá aparecer no erro.
	 */
	private static void validaString(String verificada, String nomeDaString) {
		if(verificada.isEmpty()) {
			throw new IllegalArgumentException("A string está " + nomeDaString + " vazia.");
		}
		
		if (verificada.trim().equals("")) {
			throw new IllegalArgumentException("A string " + nomeDaString + " só possui espaços vazios.");
		}
		
	}
	
	/**
	 * Verifica se os parâmetros recebidos são nulos, caso sim, será lançado um
	 * NullPointerException. Além de utilizar o método validaString para verificar
	 * se os nomes atribuídos são válidos. Se os nomes forem válidos, será
	 * construído um objeto com o nome, sobrenome e telefone recebidos pro parâmetro.
	 * 
	 * @param nome é o nome a ser gravado no contato.
	 * @param sobrenome é o sobrenome a ser gravado no contato.
	 * @param telefone é o telefone a ser gravado no contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if (nome == null) {
			throw new NullPointerException("O nome recebido é do tipo nulo.");
		}
		if(sobrenome == null) {
			throw new NullPointerException("O sobrenome recebido é do tipo nulo.");
		}
		if (telefone == null) {
			throw new NullPointerException("O telefone recebido é do tipo nulo.");
		}
		
		validaString(nome, "nome");
		validaString(sobrenome, "sobrenome");
		validaString(telefone, "telefone");
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	/**
	 * Retorna o nome do contato.
	 * 
	 * @return retorna uma String com o nome do contato.
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Retorna o sobrenome do contato.
	 * 
	 * @return retorna uma String com o sobrenome do contato.
	 */
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	/**
	 * Retorna o nome completo do contato.
	 * 
	 * @return retorna uma String com o nome completo do contato.
	 */
	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}

	/**
	 * Compara se dois contatos são iguais ao comparar se o nome e
	 * sobrenome de ambos são iguais.
	 */
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

	/**
	 * Retorna uma String com todos os dados do contato, no formato:
	 * "NOME SOBRENOME - TELEFONE".
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + " - " + this.telefone;
	}
}