package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.Conta.Tipo;

@Entity
@Table(name = "tab_lancamento")
public class Lancamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date date;
	//@OneToOne
	//private PlanoConta plano;
	//@ManyToMany
	//private Conta conta;
	private Tipo tipoConta;
	private String descricao;
	private String login;
	private Double valor;
	//@ManyToMany
	//private Conta contaDestino;
	
	public Lancamento() {
		this(null, null, null, null, null, null, null, null, null);
	}
	
	public Lancamento(Integer id, Date date, PlanoConta plano, Conta conta, Tipo tipoConta, String descricao,
			String login, Double valor, Conta contaDestino) {
		super();
		this.id = id;
		this.date = date;
		//this.plano = plano;
		//this.conta = conta;
		this.tipoConta = tipoConta;
		this.descricao = descricao;
		this.login = login;
		this.valor = valor;
		//this.contaDestino = contaDestino;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public PlanoConta getPlano() {
		return plano;
	}
	public void setPlano(PlanoConta plano) {
		this.plano = plano;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public Tipo getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(Tipo tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Conta getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	
}
