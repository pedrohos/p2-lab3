package agenda;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		final String MENU = "(C)adastrar Contato\n" + 
                			"(L)istar Contatos\n" + 
                			"(E)xibir Contato\n" + 
                			"(S)air\n" + 
                			"\n" + 
                			"Opção> ";
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print(MENU);
			String entrada = sc.nextLine();
			if (entrada.equals("S")) {
				break;
			}
			
			switch (entrada) {
			case "C":
				System.out.print("\nPosição: ");
				
				int posicao = sc.nextInt();
				sc.nextLine();
				
				if (posicao < 1 || posicao > 100) {
					System.out.println("POSIÇÃO INVÁLIDA!\n");
					break;
				}
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("Sobrenome: ");
				String sobrenome = sc.nextLine();
				
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				System.out.println("CADASTRO REALIZADO!\n");
				
				agenda.cadastrarContato(posicao, nome, sobrenome, telefone);
				
				break;
				
			case "L":
				System.out.print("\n");
				System.out.println(agenda.listarContatos());
				break;
	
			case "E":
				System.out.print("Contato> ");
				int posicaoExibir = sc.nextInt();
				sc.nextLine();
				System.out.print("\n");
				String contato = agenda.pesquisarContato(posicaoExibir);
				if (contato != null) {
					System.out.println(agenda.pesquisarContato(posicaoExibir) + "\n");
				} else {
					System.out.println("POSIÇÃO INVÁLIDA!\n");
				}	
				
				break;
				
			default:
				System.out.println("OPÇÃO INVÁLIDA!\n");
				break;
			}
		}
	}
}