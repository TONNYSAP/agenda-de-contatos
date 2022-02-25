package classes;

import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity(name="contatos")
@Table(name="contatos")
public class Contatos {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="nome_contato")
	private String nome_contato;
	
	@Column(name="telefone_contato")
	private String telefone_contato;
	
	@Column(name="telefone_tb_contato")
	private String telefone_tb_contato;
	
	@Column(name="email_contato")
	private String email_contato;

	
	public Contatos() {
		super();
	}


	public Contatos(String nome_contato, String telefone_contato, String telefone_tb_contato, String email_contato) {
		super();
		this.nome_contato = nome_contato;
		this.telefone_contato = telefone_contato;
		this.telefone_tb_contato = telefone_tb_contato;
		this.email_contato = email_contato;
	}


	public Contatos(Integer id, String nome_contato, String telefone_contato, String telefone_tb_contato,
			String email_contato) {
		super();
		this.id = id;
		this.nome_contato = nome_contato;
		this.telefone_contato = telefone_contato;
		this.telefone_tb_contato = telefone_tb_contato;
		this.email_contato = email_contato;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome_contato() {
		return nome_contato;
	}


	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}


	public String getTelefone_contato() {
		return telefone_contato;
	}


	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
	}


	public String getTelefone_tb_contato() {
		return telefone_tb_contato;
	}


	public void setTelefone_tb_contato(String telefone_tb_contato) {
		this.telefone_tb_contato = telefone_tb_contato;
	}


	public String getEmail_contato() {
		return email_contato;
	}


	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email_contato == null) ? 0 : email_contato.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome_contato == null) ? 0 : nome_contato.hashCode());
		result = prime * result + ((telefone_contato == null) ? 0 : telefone_contato.hashCode());
		result = prime * result + ((telefone_tb_contato == null) ? 0 : telefone_tb_contato.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contatos other = (Contatos) obj;
		if (email_contato == null) {
			if (other.email_contato != null)
				return false;
		} else if (!email_contato.equals(other.email_contato))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome_contato == null) {
			if (other.nome_contato != null)
				return false;
		} else if (!nome_contato.equals(other.nome_contato))
			return false;
		if (telefone_contato == null) {
			if (other.telefone_contato != null)
				return false;
		} else if (!telefone_contato.equals(other.telefone_contato))
			return false;
		if (telefone_tb_contato == null) {
			if (other.telefone_tb_contato != null)
				return false;
		} else if (!telefone_tb_contato.equals(other.telefone_tb_contato))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Contatos {" + "\n" 
							+ "id=" + id + "\n" 
							+ ", nome_contato=" + nome_contato + "\n"
							+ ", telefone_contato=" + telefone_contato + "\n"
							+ ", telefone_tb_contato=" + telefone_tb_contato + "\n"
							+ ", email_contato=" + email_contato + "\n"
							+ "}" + "\n" + 
							"*****************************************************";
	}
	
	
	
}
