package app;

import java.util.List;

import dao.ContaRepository;
import dao.UsuarioRepository;
import model.Conta;
import model.Conta.Tipo;
import model.Usuario;

public class SistemaUsuario {
	
	static UsuarioRepository repository = new UsuarioRepository();
	static ContaRepository contaRepository = new ContaRepository();
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario();
		user1.setName("Maycon Leite");;
		user1.setCpf("999.999.999-99");
		user1.setLogin("mayconLeite");
		user1.setPhone("1166666666");
		user1.setPassword("123456");

		repository.save(user1);

		Usuario user2 = new Usuario();
		user2.setName("Ricardo Montes");;
		user2.setCpf("888.888.888-88");
		user2.setLogin("ricardo");
		user2.setPhone("999999999");
		user2.setPassword("root");

		repository.save(user2);
		
		Usuario user3 = new Usuario();
		user3.setName("Temporario");;
		user3.setCpf("898.656.235-88");
		user3.setLogin("criativo");
		user3.setPhone("12345678910");
		user3.setPassword("novasenha");

		repository.save(user3);
		
		Usuario userToUpdate = repository.find(3);
		userToUpdate.setName("Mudou o Nome");;
		userToUpdate.setCpf("777.888.777-77");
		userToUpdate.setLogin("substituto");
		userToUpdate.setPhone("78956432815");
		userToUpdate.setPassword("novissimasenha");

		repository.update(userToUpdate);
		
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
