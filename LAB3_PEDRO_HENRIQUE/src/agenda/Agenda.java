package agenda;

import java.util.Arrays;

/**
 * Representa uma agenda, que possui um conjunto de 100 contatos.
 * É possível cadastrar, pesquisar, listar contatos.
 * 
 * @author Pedro Silva
 */
public class Agenda {
	
	/**
	 * Representa um array de contatos
	 */
	private Contato[] contatos;
	
	/**
	 * Inicializa o array de contatos com 100 contatos.
	 */
	public Agenda() {
		this.contatos = new Contato[100];
	}
	
	/**
	 * Gera um contato com os dados recebidos (nome, sobrenome e telefone)
	 * e armazena na posição passada pelo parâmetro.
	 * 
	 * @param posicao é qual contato deve ser modificado.
	 * @param nome é o nome do contato.
	 * @param sobrenome é o sobrenome do contato.
	 * @param telefone é o telefone do contato.
	 */
	public void cadastrarContato(int posicao, String nome, String sobrenome, String telefone) {
		this.contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
	}
	
	/**
	 * Pesquisa se há um contato na posição recebida e retorna ele,
	 * caso contrário, há um catch na exceção NullPointerException
	 * e é retornado: "POSIÇÃO INVÁLIDA!".
	 * 
	 * @param posicao é a posição a qual o contato será pesquisado.
	 * @return retorna o objeto se ele existir, caso contrário,
	 * retorna "POSIÇÃO INVÁLIDA!".
	 */
	public String pesquisarContato(int posicao) {
		Contato contato = this.contatos[posicao - 1];
		try {
			return contato.toString();
		} catch(NullPointerException npe) {
			return "POSIÇÃO INVÁLIDA!";
		}
	}
	
	/**
	 * Lista cada contato (existente) no formato:
	 * "POSICAOVISUAL - NOMECOMPLETO"
	 * 
	 * @return retorna uma String de cada contato e sua posição.
	 */
	public String listarContatos() {
		String resultado = "";
		for (int i = 0; i < 100; i++) {
			if (contatos[i] != null) {
				resultado += (i + 1) + " - " + contatos[i].getNomeCompleto() + "\n";
			}
		}
		return resultado;
	}
	
	/**
	 * Compara se duas agendas são iguais ao comparar se ambos os contatos
	 * estão nas mesmas posições e se seus respectivos nomes e sobrenomes
	 * são iguais.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contatos, other.contatos))
			return false;
		return true;
	}
}