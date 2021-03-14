package dao;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Usuario;
import model.Conta.TipoConta;
import model.PlanoConta.TipoMovimento;
import model.PlanoConta;

public class UsuarioRepository extends AbstractRepository<Usuario> implements Repository<Usuario>{
	
	public void save(Usuario usuario) {
		// Criando duas contas com tipos diferentes para o Usuario
		List<Conta> contas = new ArrayList<Conta>();
		Conta contaBanco = new Conta();
		contaBanco.setNumero(12345678);
		contaBanco.setTipo(TipoConta.BANCO);
		contaBanco.setUsuario(usuario);
		
		Conta contaCredito = new Conta();
		contaCredito.setNumero(4567897);
		contaCredito.setTipo(TipoConta.CREDITO);
		contaCredito.setUsuario(usuario);
		
		contas.add(contaBanco);
		contas.add(contaCredito);
		
		usuario.setContas(contas);
		
		super.save(usuario);
		
		// Criando 3 planos de conta PADRÃO para o Usuario
		List<PlanoConta> planos = new ArrayList<PlanoConta>();

		PlanoConta plano1 = new PlanoConta();
		plano1.setUsuario(usuario);
		plano1.setNome("RECEITAS");
		plano1.setTipo(TipoMovimento.R);
		plano1.setPadrao(true);
		
		PlanoConta plano2 = new PlanoConta();
		plano2.setUsuario(usuario);
		plano2.setNome("DESPESAS");
		plano2.setTipo(TipoMovimento.D);
		plano2.setPadrao(true);
		
		PlanoConta plano3 = new PlanoConta();
		plano3.setUsuario(usuario);
		plano3.setNome("TRANSFERÊNCIA ENTRE USUÁRIOS");
		plano3.setTipo(TipoMovimento.TU);
		plano3.setPadrao(true);
		
		PlanoConta plano4 = new PlanoConta();
		plano4.setUsuario(usuario);
		plano4.setNome("TRANSFERÊNCIA ENTRE CONTAS");
		plano4.setTipo(TipoMovimento.TC);
		plano4.setPadrao(true);
		
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		usuario.setPlanos(planos);
		
		super.save(usuario);
	}
}