package dao;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Usuario;
import model.Conta.Tipo;
import model.PlanoConta.TipoMovimento;
import model.PlanoConta;

public class UsuarioRepository extends AbstractRepository<Usuario> implements Repository<Usuario>{
	
	public void save(Usuario usuario) {
		// Criando duas contas com tipos diferentes para o Usuario
		List<Conta> contas = new ArrayList<Conta>();
		Conta contaBanco = new Conta();
		contaBanco.setNumero(12345678);
		contaBanco.setTipo(Tipo.BANCO);
		contaBanco.setUsuario(usuario);
		
		Conta contaCredito = new Conta();
		contaCredito.setNumero(4567897);
		contaCredito.setTipo(Tipo.CREDITO);
		contaCredito.setUsuario(usuario);
		
		contas.add(contaBanco);
		contas.add(contaCredito);
		
		usuario.setContas(contas);
		
		super.save(usuario);
		
		// Criando 3 planos de conta para o Usuario
		List<PlanoConta> planos = new ArrayList<PlanoConta>();

		PlanoConta plano1 = new PlanoConta();
		plano1.setUsuario(usuario);
		plano1.setTipo(TipoMovimento.R);
		plano1.setPadrao(true);
		
		PlanoConta plano2 = new PlanoConta();
		plano2.setUsuario(usuario);
		plano2.setTipo(TipoMovimento.D);	
		
		PlanoConta plano3 = new PlanoConta();
		plano3.setUsuario(usuario);
		plano3.setTipo(TipoMovimento.TU);
		
		PlanoConta plano4 = new PlanoConta();
		plano4.setUsuario(usuario);
		plano4.setTipo(TipoMovimento.TC);
		
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		
		usuario.setPlanos(planos);
		
		super.save(usuario);
	}
}