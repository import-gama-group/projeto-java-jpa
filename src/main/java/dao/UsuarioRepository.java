package dao;

import java.util.List;

import model.Usuario;

public class UsuarioRepository extends AbstractRepository<Usuario> implements Repository<Usuario>{

	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario find(Integer id) {
		Usuario user = em.find(Usuario.class, id);
		return null;
	}

}
