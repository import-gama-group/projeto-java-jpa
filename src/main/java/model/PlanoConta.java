package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_planoConta")
public class PlanoConta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne 
	private Usuario usuario;
	private String nome;
	//@ENUMARATION STRING
	//  STRING NOME
	private TipoMovimento tipo; 
	private Boolean padrao;
	//@OneToMany(mappedBy = "plano", cascade = CascadeType.PERSIST)
	//private List<Lancamento> lancamentos;
	
	public PlanoConta() {
		this(null, null, null, null, false);
	}
	// Constructor
	public PlanoConta(Integer id, Usuario usuario, String nome, TipoMovimento tipo, Boolean padrao) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nome = nome;
		this.tipo = tipo;
		this.padrao = padrao;
	}
	// Getter and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoMovimento getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimento tipo) {
		this.tipo = tipo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Boolean getPadrao() {
		return padrao;
	}
	public void setPadrao(Boolean padrao) {
		this.padrao = padrao;
	}

	// ENUM
	public enum TipoMovimento{
		R,
		D, 
		TU,
		TC
	}
}
