package dao;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.Usuario;
import model.Conta.Tipo;

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
	}
	
/*
	public void save(Usuario usuario) {
		
		// Criando Usuario
		super.save(usuario);
		
		// Instanciando o repositorio de conta
		ContaRepository contaRepository = new ContaRepository();
		
		// Criando conta banco do Usuario
		Conta contaBanco = new Conta();
		contaBanco.setNumero(12345678);
		contaBanco.setTipo(Tipo.BANCO);
		contaBanco.setUsuario(usuario);
		contaRepository.save(contaBanco);
		
		// Criando conta credito do Usuario 
		Conta contaCredito = new Conta();
		contaCredito.setNumero(4567897);
		contaCredito.setTipo(Tipo.CREDITO);
		contaCredito.setUsuario(usuario);
		contaRepository.save(contaCredito);
	}*/
}