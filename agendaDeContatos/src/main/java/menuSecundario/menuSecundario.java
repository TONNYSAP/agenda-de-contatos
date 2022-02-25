package menuSecundario;

import java.util.Scanner;

import controller.Controlador;
import menuPrincipal.MenuPrincipal;

public class menuSecundario {

public static void MenuS() {
	@SuppressWarnings("resource")
	Scanner scann = new Scanner(System.in);
	
	System.out.println("*************************");
	System.out.println("Minha Agenda de Contatos");
	System.out.println("*************************");
	System.out.println("1 - Cadastrar Contato");
	System.out.println("2 - Listar Contatos");
	System.out.println("3 - Encontrar Contato");
	System.out.println("4 - Remover Contato");
	System.out.println("5 - Sair");
	System.out.println("");
	
	System.out.print("Escolha qual opção você quer: ");			
	int valor = scann.nextInt();
	
	switch(valor) {
	
	case 1:	//System.out.println("Contato Cadastrado");
			Controlador.CadastrarContato();
		
		break;
	
	case 2: //System.out.println("Listar contatos");
			Controlador.ListarContatos();
		
		break;
		
	case 3: //System.out.println("Encontrar contato pelo Id");
			Controlador.EncontrarContatoId();
		
		break;
		
	case 4: //System.out.println("Remover contato");
			//Controlador.RemoverContatoId();
			Controlador.RemoverContatoID();;
		break;
		
	case 5: MenuPrincipal.MenuP();
		
		break;
	
	default: System.out.println("Valor inválido!");
		
		break;
	}
  }
}
