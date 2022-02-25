package gerenciardor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import classes.Contatos;
import classes.Usuarios;

public class Gerenciador {

	public static EntityManager Gerenciar() {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDagenda");
		EntityManager manager = managerFactory.createEntityManager();
		
	return manager;
	}
	
	public static Contatos GerenciarIDCont(Integer id) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDagenda");
		EntityManager manager = managerFactory.createEntityManager();
		Contatos contatos = manager.find(Contatos.class, id);		
		
	return contatos;
	}
	
	
	public static Usuarios GerenciarIDUser(Integer id) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("BDagenda");
		EntityManager manager = managerFactory.createEntityManager();
		Usuarios user = manager.find(Usuarios.class, id);		
		
	return user;
	}
}
