package controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import classes.Contatos;

import gerenciardor.Gerenciador;
//import gerenciardor.Gerenciador;
import menuSecundario.menuSecundario;

public class Controlador {

	public static void CadastrarContato() {
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		
		
		System.out.print("Informe o nome do contato: ");
		String nome = scann.nextLine();
		
		System.out.print("Telefone do contato: ");
		String fone = scann.next();	
		
		System.out.print("Chave de identificação(id) do contato: ");
		Integer id = scann.nextInt();
		
		System.out.print("Telefone do trabalho do contato: ");
		String fonetb = scann.next();	
		
		System.out.print("Número da casa do contato: ");
		Integer numero_casa = scann.nextInt();
		
		System.out.print("O Email do contato: ");
		String email = scann.next();
		
		System.out.print("CEP do contato: ");
		Integer cep = scann.nextInt();
		
//		System.out.print("");
//		System.out.print("");
		
		
		if(nome != null && email != null) {
			Contatos contatos = new Contatos();
			contatos.setId(id);
			contatos.setNome_contato(nome);
			contatos.setTelefone_contato(fone);
			contatos.setTelefone_tb_contato(fonetb);
			contatos.setEmail_contato(email);
			
			EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDagenda");
			EntityManager manager = managerFactory.createEntityManager();
			
			manager.getTransaction().begin();
			manager.persist(contatos);
			manager.getTransaction().commit();
			managerFactory.close();
			manager.close();
			
			//Gerenciador.Gerenciar().getTransaction().begin();
			//Gerenciador.Gerenciar().persist(contatos);
			//Gerenciador.Gerenciar().getTransaction().commit();
			
			
			System.out.println("Contato Cadastrado com Sucesso");
			menuSecundario.MenuS();
		
		}else{
			System.out.println("Dados fornecidos são inválidos. Cadastre novamente!");
		}
		
	}
	
	public static void ListarContatos() {
		
		Query query = Gerenciador.Gerenciar().
				createQuery("SELECT c FROM contatos AS c");
		List<?> lista = query.getResultList();
		System.out.println("Listagem dos Contatos: ");
		System.out.println(lista);
		
		menuSecundario.MenuS();
		Gerenciador.Gerenciar().close();
	}
	
	public static void EncontrarContatoId() {
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		
		System.out.print("Informe o Id(identificação) do contato: ");
		Integer id = scann.nextInt();
		
		String nomeCont = Gerenciador.GerenciarIDCont(id).getNome_contato();
		String emailCont = Gerenciador.GerenciarIDCont(id).getEmail_contato();
		String tele = Gerenciador.GerenciarIDCont(id).getTelefone_contato();
		String teleTB = Gerenciador.GerenciarIDCont(id).getTelefone_tb_contato();
		
		System.out.println("********************************");
		System.out.println("Contato: ");
		System.out.println("Nome: " + nomeCont +
				", Email: " + emailCont + 
				", Telefone: " + tele + 
				", Telefone Trabalho: " + teleTB);
		System.out.println("********************************");
		
		menuSecundario.MenuS();
	}
	
//	public static void RemoverContatoId() {
//		@SuppressWarnings("resource")
//		Scanner scann = new Scanner(System.in);
//		
//		System.out.print("Remover Contato com número de Identificação(id): ");
//		int id = scann.nextInt();
//		
//				
//		Contatos contatos = Gerenciador.Gerenciar().find(Contatos.class, id);
//		if(contatos != null) {
//			try {				
//				
//				Gerenciador.Gerenciar().getTransaction().begin();				
//				Gerenciador.Gerenciar().remove(Gerenciador.Gerenciar()
//						.contains(contatos) ? contatos : Gerenciador.Gerenciar()
//								.merge(contatos) );
//				Gerenciador.Gerenciar().getTransaction().commit();
//				Gerenciador.Gerenciar().close();
//				
//				System.out.println("Contato de  id: " + id + ", foi Removido!");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		menuSecundario.MenuS();
//	}
	
	public static void RemoverContatoID() {
		@SuppressWarnings("resource")
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Escreva o ID do contato para remoção: ");
		int id = scann.nextInt();
		
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDagenda");
		EntityManager manager = managerFactory.createEntityManager();
		
		
		try {
			manager.getTransaction().begin();
			Query query = manager.
					createQuery("DELETE FROM contatos c WHERE c.id= :id");
				query.setParameter("id", id).executeUpdate();
				
			manager.getTransaction().commit();
			managerFactory.close();
			manager.close();
			//System.out.println(query);
			System.out.println("Contato de ID= " + id + ", foi Removido com Sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		menuSecundario.MenuS();
	}
}
