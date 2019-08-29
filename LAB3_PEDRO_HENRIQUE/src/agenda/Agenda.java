package agenda;

import java.util.Arrays;

public class Agenda {
	private Contato[] contatos;
	
	public Agenda() {
		this.contatos = new Contato[100];
	}
	
	public void cadastrarContato(int posicao, String nome, String sobrenome, String telefone) {
		this.contatos[posicao - 1] = new Contato(nome, sobrenome, telefone);
	}
	
	public String pesquisarContato(int posicao) {
		Contato contato = this.contatos[posicao - 1];
		try {
			return contato.toString();
		} catch(IllegalArgumentException iae) {
			return "POSIÇÃO INVÁLIDA!";
		}
	}
	
	public String listarContatos() {
		String resultado = "";
		for (int i = 0; i < 100; i++) {
			if (contatos[i] != null) {
				resultado += (i + 1) + " - " + contatos[i].getNomeCompleto() + "\n";
			}
		}
		return resultado;
	}
	
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