package agenda;

/**
 * Representa um contato, este possui um nome, sobrenome e um telefone.
 * 
 * @author Pedro Silva
 */
public class Contato {
	
	/**
	 * E o nome do contato,
	 */
	private String nome;
	
	/**
	 * E o sobrenome do contato.
	 */
	private String sobrenome;
	
	/**
	 * E o telefone do contato.
	 */
	private String telefone;
	
	/**
	 * Verifica se a string recebida esta vazia ou se so possuir espacos vazios,
	 * caso sim, sera lancado um IllegalArgumentException apontando o erro. 
	 * 
	 * @param verificada e a string a ser verificada.
	 * @param nomeDaString e o nome da variavel que ira aparecer no erro.
	 */
	private static void validaString(String verificada, String nomeDaString) {
		if(verificada.isEmpty()) {
			throw new IllegalArgumentException("A string esta " + nomeDaString + " vazia.");
		}
		
		if (verificada.trim().equals("")) {
			throw new IllegalArgumentException("A string " + nomeDaString + " so possui espacos vazios.");
		}
		
	}
	
	/**
	 * Verifica se os parametros recebidos sao nulos, caso sim, sera lancado um
	 * NullPointerException. Alem de utilizar o metodo validaString para verificar
	 * se os nomes atribuidos sao validos. Se os nomes forem validos, sera
	 * construido um objeto com o nome, sobrenome e telefone recebidos pro parametro.
	 * 
	 * @param nome e o nome a ser gravado no contato.
	 * @param sobrenome e o sobrenome a ser gravado no contato.
	 * @param telefone e o telefone a ser gravado no contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if (nome == null) {
			throw new NullPointerException("O nome recebido e do tipo nulo.");
		}
		if(sobrenome == null) {
			throw new NullPointerException("O sobrenome recebido e do tipo nulo.");
		}
		if (telefone == null) {
			throw new NullPointerException("O telefone recebido e do tipo nulo.");
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
	 * Compara se dois contatos sao iguais ao comparar se o nome e
	 * sobrenome de ambos sao iguais.
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