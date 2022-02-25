package login;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import classes.Usuarios;
//import controller.Controlador;
import gerenciardor.Gerenciador;
import menuPrincipal.MenuPrincipal;
import menuSecundario.menuSecundario;

public class Login {

	public static void Logar() {
		
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Nome de Usuário: ");
		String nomeuser = scann.next();
		
		System.out.print("Senha de Usuário: ");
		Integer senha = scann.nextInt();
		
		System.out.print("Id de Usuário: ");
		Integer id = scann.nextInt();
		
		//String n = "tony";
		//Integer p = 12;
		//Gerenciador.GerenciarID(20).getNome_usuario();
		//Gerenciador.GerenciarID(20).getSenha_usuario();
		
			
		System.out.println(Gerenciador.GerenciarIDUser(id).getNome_usuario() + " / " + Gerenciador.GerenciarIDUser(id).getSenha_usuario());
		System.out.println("");
		
		if((nomeuser.equals(Gerenciador.GerenciarIDUser(id).getNome_usuario()))==true && (senha.equals(Gerenciador.GerenciarIDUser(id).getSenha_usuario()))==true) {
			
			System.out.println("################################");
			System.out.println("usuário logado");
			
			menuSecundario.MenuS();
		
		}else {
			System.out.println("acesso negado!");
			MenuPrincipal.MenuP();
		}
	}
	
	public static void CadastrarUser() {
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Informe um nome de Usuário: ");
		String nomeuser = scann.next();
		
		System.out.print("Informe um email: ");
		String email = scann.next();
				
		System.out.print("Informe um id(identificação) de Usuário: ");
		Integer id = scann.nextInt();
		
		System.out.print("Informe uma Senha: ");
		Integer senha = scann.nextInt();
		
		
		
		if(nomeuser != null && senha != null) {
			Usuarios user = new Usuarios();
			user.setId(id);
			user.setNome_usuario(nomeuser);
			user.setEmail_contato(email);			
			user.setSenha_usuario(senha);
			
			//Gerenciador.Gerenciar().getTransaction().begin();
			//Gerenciador.Gerenciar().persist(user);
			//Gerenciador.Gerenciar().getTransaction().commit();
			
			EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDagenda");
			EntityManager manager = managerFactory.createEntityManager();
			
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			managerFactory.close();
			manager.close();
			
			System.out.println("Usuário Cadastrdo com Sucesso!");
			MenuPrincipal.MenuP();
		
		}else {
			System.out.println("Usuário e/ou Senha inválidos");
			MenuPrincipal.MenuP();
		}		
		
	}
	
	public static void RemoverUser() {
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Informe o ID do Usuário para remoção: ");
		int id = scann.nextInt();
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDagenda");
		EntityManager manager = managerFactory.createEntityManager();
		
		try {
			manager.getTransaction().begin();
				Query query = manager.createQuery("DELETE FROM usuarios c WHERE c.id= :id");
				query.setParameter("id", id).executeUpdate();
			manager.getTransaction().commit();
			managerFactory.close();
			manager.close();
			//System.out.println(query);
			System.out.println("Usuário com ID= " + id + ", foi Removido com Sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MenuPrincipal.MenuP();
	}
}
