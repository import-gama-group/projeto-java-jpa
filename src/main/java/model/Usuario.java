package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	@OneToOne
	private PlanoConta plano;
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
	
	public Integer getId() {
		return id;
	}
	public PlanoConta getPlano() {
		return plano;
	}
	public void setPlano(PlanoConta plano) {
		this.plano = plano;
	}
	public void setId(Integer id) {
		this.id = id;
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
