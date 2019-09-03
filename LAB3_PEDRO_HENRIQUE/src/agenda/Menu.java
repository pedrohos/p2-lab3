package agenda;

import java.util.Scanner;

public class Menu {
	
	static Agenda agenda = new Agenda();
	static Scanner sc = new Scanner(System.in);
	
	public static boolean cadastrarContato(int posicao) {
		try {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Sobrenome: ");
			String sobrenome = sc.nextLine();
			
			System.out.print("Telefone: ");
			String telefone = sc.nextLine();
			
			agenda.cadastrarContato(posicao, nome, sobrenome, telefone);
		} catch(NullPointerException npe) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		final String MENU = "(C)adastrar Contato\n" + 
                			"(L)istar Contatos\n" + 
                			"(E)xibir Contato\n" + 
                			"(S)air\n" + 
                			"\n" + 
                			"Opção> ";
		while (true) {
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
				
				if (cadastrarContato(posicao) == true) {
					System.out.println("CADASTRO REALIZADO!\n");
				}
				
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
				try {
					System.out.println(agenda.pesquisarContato(posicaoExibir) + "\n");
				} catch(NullPointerException npe) {
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