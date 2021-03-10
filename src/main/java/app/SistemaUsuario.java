package app;

import java.util.List;

import dao.UsuarioRepository;
import model.Usuario;



public class SistemaUsuario {
	
	static UsuarioRepository repository = new UsuarioRepository();
	public static void main(String[] args) {
		save();
		update();
		list();
	}
	static void save() {
		Usuario usuario = new Usuario();
		usuario.setName("Maycon Leite");;
		usuario.setCpf("999.999.999-99");
		usuario.setLogin("mayconLeite");
		usuario.setPhone("1166666666");
		usuario.setPassword("123456");
		repository.save(usuario);
	}
	static void update() {
		Object idUsuarioQueSalvouNaBase = 1; //mudar
		
		Usuario usuario = repository.find(idUsuarioQueSalvouNaBase);
		
		if(usuario!=null) {
			usuario.setName("Maycon Leite");;
			usuario.setCpf("999.999.999-99");
			usuario.setLogin("mayconLeite");
			usuario.setPhone("1166666666");
			usuario.setPassword("123456");
			repository.update(usuario);
		}
	}
	
	static void list() {
		System.out.println("LISTANDO USUARIO");
		
		List<Usuario> usuario = repository.list();
		
		for(Usuario c: usuario) {
			System.out.println(c);
		}
	}
	
	
	
}
