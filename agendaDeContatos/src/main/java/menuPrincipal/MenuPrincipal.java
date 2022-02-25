package menuPrincipal;

import java.util.Scanner;

import login.Login;

public class MenuPrincipal {

	public static void MenuP () {
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		
		
		System.out.println("*************************");
		System.out.println("Minha Agenda de Contatos");
		System.out.println("*************************");
		System.out.println("1 - Logar");
		System.out.println("2 - Cadastrar Usuário");
		System.out.println("3 - Remover Usuário");
		System.out.println("");
		System.out.print("Escolha uma das opções acima: ");
		int valor = scann.nextInt();
		
		switch(valor) {
		
		case 1: 
			//System.out.println("Logar");
			Login.Logar();
		break;
		
		case 2:
			//System.out.println("Cadastrar Usuário");
			Login.CadastrarUser();
		break;
		
		case 3: 
			//System.out.println("REMOÇÃO");
			Login.RemoverUser();
		break;
		
		default: System.out.println("Valor inválido!");
			
		break;
		}
		
	}
}
