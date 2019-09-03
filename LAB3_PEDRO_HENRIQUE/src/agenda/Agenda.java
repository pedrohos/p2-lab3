package agenda;

import java.util.Arrays;

/**
 * Representa uma agenda, que possui um conjunto de 100 contatos.
 * E possivel cadastrar, pesquisar, listar contatos.
 * 
 * @author Pedro Silva
 */
public class Agenda {
	
	/**
	 * Representa um array de contatos.
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
	 * e armazena na posicao passada pelo parametro.
	 * 
	 * @param posicao e qual contato deve ser modificado.
	 * @param nome e o nome do contato.
	 * @param sobrenome e o sobrenome do contato.
	 * @param telefone e o telefone do contato.
	 */
	public void cadastrarContato(int posicao, String nome, String sobrenome, String telefone) {
		this.contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
	}
	
	/**
	 * Pesquisa se ha um contato na posicao recebida e retorna ele,
	 * caso contrario, ha um catch na excecao NullPointerException
	 * e entao e retornado: "POSICAO INVALIDA!".
	 * 
	 * @param posicao e a posicao na qual o contato sera feito a pesquisa.
	 * @return retorna o objeto se ele existir, caso contrario, retorna:
	 * "POSICAO INVALIDA!".
	 */
	public String pesquisarContato(int posicao) {
		return this.contatos[posicao - 1].toString();
	}
	
	/**
	 * Lista cada contato (existente) no formato:
	 * "POSICAOVISUAL - NOMECOMPLETO"
	 * 
	 * @return retorna uma String de cada contato e sua posicao.
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
	 * Compara se duas agendas sao iguais, ao comparar se ambos os contatos
	 * estao nas mesmas posicoes e se seus respectivos nomes e sobrenomes
	 * sao iguais.
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