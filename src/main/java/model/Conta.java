package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tab_conta")
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Usuario usuario;
	private Integer numero;
	private Double saldo;
	private Tipo tipo;
	
	
	public Conta() {
		this(null, null, null, 0.0, null );
	}
	// Constructor
	public Conta(Usuario user, Integer id, Integer numero, Double saldo, Tipo tipo) {
		this.id = id;
		this.usuario = user;
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	// Getters and Setters
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	};
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	// ENUM
	public enum Tipo {
		BANCO, CREDITO
	}
}
