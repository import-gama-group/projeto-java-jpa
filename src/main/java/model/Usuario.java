package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String login;
	private String password;
	private String name;
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST)
	private List<PlanoConta> planos;
	private String cpf;
	private String phone;
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST)
	private List<Conta> contas;
	
	public Usuario() {
		this(null, null, null, null);
	}
	// Constructor
	public Usuario(Integer id, String login, String password, String name) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.name = name;
	}
	// Getter and Setters
	public List<PlanoConta> getPlanos() {
		return planos;
	}
	public void setPlanos(List<PlanoConta> planos) {
		this.planos = planos;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
}
