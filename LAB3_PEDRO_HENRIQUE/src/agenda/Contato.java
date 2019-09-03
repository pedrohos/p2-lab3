package agenda;

/**
 * Representa um contato, este possui um nome, sobrenome e um telefone.
 * 
 * @author Pedro Silva
 */
public class Contato {
	
	/**
	 * � o nome do contato,
	 */
	private String nome;
	
	/**
	 * � o sobrenome do contato.
	 */
	private String sobrenome;
	
	/**
	 * � o telefone do contato.
	 */
	private String telefone;
	
	/**
	 * Verifica se a string recebida est� vazia ou se s� possui espa�os vazios,
	 * caso sim, ser� lan�ado um IllegalArgumentException apontando o erro. 
	 * 
	 * @param verificada � a string a ser verificada.
	 * @param nomeDaString � o nome da vari�vel que ir� aparecer no erro.
	 */
	private static void validaString(String verificada, String nomeDaString) {
		if(verificada.isEmpty()) {
			throw new IllegalArgumentException("A string est� " + nomeDaString + " vazia.");
		}
		
		if (verificada.trim().equals("")) {
			throw new IllegalArgumentException("A string " + nomeDaString + " s� possui espa�os vazios.");
		}
		
	}
	
	/**
	 * Verifica se os par�metros recebidos s�o nulos, caso sim, ser� lan�ado um
	 * NullPointerException. Al�m de utilizar o m�todo validaString para verificar
	 * se os nomes atribu�dos s�o v�lidos. Se os nomes forem v�lidos, ser�
	 * constru�do um objeto com o nome, sobrenome e telefone recebidos pro par�metro.
	 * 
	 * @param nome � o nome a ser gravado no contato.
	 * @param sobrenome � o sobrenome a ser gravado no contato.
	 * @param telefone � o telefone a ser gravado no contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {
		if (nome == null) {
			throw new NullPointerException("O nome recebido � do tipo nulo.");
		}
		if(sobrenome == null) {
			throw new NullPointerException("O sobrenome recebido � do tipo nulo.");
		}
		if (telefone == null) {
			throw new NullPointerException("O telefone recebido � do tipo nulo.");
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
	 * Compara se dois contatos s�o iguais ao comparar se o nome e
	 * sobrenome de ambos s�o iguais.
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