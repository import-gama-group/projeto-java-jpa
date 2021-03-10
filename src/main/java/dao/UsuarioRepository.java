package dao;

import model.Conta;
import model.Usuario;
import model.Conta.Tipo;

public class UsuarioRepository extends AbstractRepository<Usuario> implements Repository<Usuario>{

	//TODO discutir sobre refazer o save do usuario criando a conta aqui
	// verificar a forma de sobreescrever
	public void save(Usuario usuario) {
		
		ContaRepository contaRepository = new ContaRepository();
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		// logica da criação de conta
		Conta contaBanco = new Conta();
		contaBanco.setNumero(12345678);
		contaBanco.setTipo(Tipo.BANCO);
		contaBanco.setUsuario(usuario);
		contaRepository.save(contaBanco);
	}
}