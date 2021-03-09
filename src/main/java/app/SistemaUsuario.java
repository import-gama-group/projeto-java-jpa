package app;

import dao.UsuarioRepository;
import model.Usuario;

public class SistemaUsuario {
	static void criarUsuario() {
		
		//criar usuario
		//contas
		//planos de contas padrao
		
	}
	
	public static void main(String[] args) {
		
		UsuarioRepository repository = new UsuarioRepository();
		
		Usuario us = new Usuario();
	/*	
		us.setCpf("12345678912");
		us.setLogin("123");
		us.setName("Fulano");
		us.setPassword("1234");
		us.setPhone("99999999");*/
		
		Usuario u2 = new Usuario();
		
		u2.setCpf("154321646");
		u2.setLogin("1325");
		u2.setName("Beltrano");
		u2.setPassword("18665");
		u2.setPhone("912312135");
			
		
		repository.delete(3);
		repository.delete(4);
		
		
		
		
		
		/*
		repository.update(carro);
		
		repository.delete(1);
		
		List<Carro> carros = repository.list();
		
		if(carros!=null) {
			for(Carro c: carros) {
				System.out.println(c);
			}
		}
		
		
		Carro selecionado = repository.find(3);
		
		System.out.println("Selecionado: " + selecionado);
		*/
	}
}
