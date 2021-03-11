package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_planoConta")
public class PlanoConta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne 
	private Usuario usuario;
	private TipoMovimento nome; 
	private Boolean padrao;
	
	
	public PlanoConta() {
		this(null, null, null, null);
	}

	public PlanoConta(Integer id, Usuario usuario, TipoMovimento nome, Boolean padrao) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nome = nome;
		this.padrao = padrao;
	}


	public TipoMovimento getNome() {
		return nome;
	}

	public void setNome(TipoMovimento nome) {
		this.nome = nome;
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


	
	public enum TipoMovimento{
		R,
		D, 
		TU,
		TC
	}

	
}
