package app;

import java.util.List;

import dao.ContaRepository;
import dao.UsuarioRepository;
import model.Conta;
import model.Conta.Tipo;
import model.Usuario;
import utils.Formatador;


public class SistemaUsuario {
	
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
		
		/*
		Usuario userToUpdate = repository.find(3);
		userToUpdate.setName("Mudou o Nome");;
		userToUpdate.setCpf("777.888.777-77");
		userToUpdate.setLogin("substituto");
		userToUpdate.setPhone("78956432815");
		userToUpdate.setPassword("novissimasenha");

		repository.update(userToUpdate);
		*/
		
		/*
		Conta conta2 = new Conta();
		conta2.setNumero(12345678);
		conta2.setTipo(Tipo.BANCO);
		conta2.setUsuario(user1);
		contaRepository.save(conta2);
		*/

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
