package dao;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Usuario;
import model.Conta.Tipo;
import model.PlanoConta;

public class UsuarioRepository extends AbstractRepository<Usuario> implements Repository<Usuario>{
	
	public void save(Usuario usuario) {
		
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

		PlanoContaRepository planoRepository = new PlanoContaRepository();

		PlanoConta plano1 = new PlanoConta();
		plano1.setUsuario(usuario);
		planoRepository.save(plano1);
		
		usuario.setPlano(plano1);
		
		super.save(usuario);
	}
}