package classes;

import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity(name="usuarios")
@Table(name="usuarios")
public class Usuarios {

	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="nome_usuario")
	private String nome_usuario;
	
	@Column(name="email_usuario")
	private String email_contato;
	
	@Column(name="senha_usuario")
	private Integer senha_usuario;

	
	public Usuarios() {
		super();
	}


	public Usuarios(String nome_usuario, String email_contato, Integer senha_usuario) {
		super();
		this.nome_usuario = nome_usuario;
		this.email_contato = email_contato;
		this.senha_usuario = senha_usuario;
	}


	public Usuarios(Integer id, String nome_usuario, String email_contato, Integer senha_usuario) {
		super();
		this.id = id;
		this.nome_usuario = nome_usuario;
		this.email_contato = email_contato;
		this.senha_usuario = senha_usuario;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome_usuario() {
		return nome_usuario;
	}


	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}


	public String getEmail_contato() {
		return email_contato;
	}


	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}


	public Integer getSenha_usuario() {
		return senha_usuario;
	}


	public void setSenha_usuario(Integer senha_usuario) {
		this.senha_usuario = senha_usuario;
	}


	

	
}
