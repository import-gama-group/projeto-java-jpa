package app;

import java.util.List;

import dao.ContaRepository;
import dao.PlanoContaRepository;
import dao.UsuarioRepository;
import model.Usuario;
import utils.Formatador;

public class SistemaUsuario {
	static PlanoContaRepository planoRepository = new PlanoContaRepository();
	static UsuarioRepository repository = new UsuarioRepository();
	static ContaRepository contaRepository = new ContaRepository();
	public static void main(String[] args) throws Exception {
		
		Usuario user1 = new Usuario();
		user1.setName("Maycon Leite");;
		user1.setCpf(Formatador.formatadorCpf("33468456515"));
		user1.setLogin("mayconLeite");
		user1.setPhone(Formatador.formatadorPhone("34654816123"));
		user1.setPassword("123456");

		repository.save(user1);

		Usuario user2 = new Usuario();
		user2.setName("Ricardo Montes");;
		user2.setCpf(Formatador.formatadorCpf("89865623588"));
		user2.setLogin("ricardo");
		user2.setPhone(Formatador.formatadorPhone("12112456789"));
		user2.setPassword("root");

		repository.save(user2);
		
		Usuario user3 = new Usuario();
		user3.setName("Temporario");;
		user3.setCpf(Formatador.formatadorCpf("89865623588"));
		user3.setLogin("criativo");
		user3.setPhone(Formatador.formatadorPhone("12112456789"));
		user3.setPassword("novasenha");

		repository.save(user3);

		//list();
		/*
		static void list() {
		System.out.println("LISTANDO USUARIO");
		
		List<Usuario> usuario = repository.list();
		
		for(Usuario c: usuario) {
			System.out.println(c);
		}
		*/
	}
}
