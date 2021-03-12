package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "conta", cascade = CascadeType.PERSIST)
	private List<Lancamento> lancamentosConta;
	@OneToMany(mappedBy = "contaDestino", cascade = CascadeType.PERSIST)
	private List<Lancamento> lancamentosContaDestino;
	
	
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
	public List<Lancamento> getLancamentosConta() {
		return lancamentosConta;
	}
	public void setLancamentosConta(List<Lancamento> lancamentosConta) {
		this.lancamentosConta = lancamentosConta;
	}
	public List<Lancamento> getLancamentosContaDestino() {
		return lancamentosContaDestino;
	}
	public void setLancamentosContaDestino(List<Lancamento> lancamentosContaDestino) {
		this.lancamentosContaDestino = lancamentosContaDestino;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	// ENUM
	public enum Tipo {
		BANCO, CREDITO
	}
}
