package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import model.Usuario;

public class AbstractRepository <E> {
	protected EntityManager em;
	public AbstractRepository() {
		em = Persistence.createEntityManagerFactory("PU_AULA").createEntityManager();
		//System.out.println("Conectando: " + em!=null);
	}
	public void save(E e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}
	public void update(E e) {
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
	}
	
	public void delete(Integer id) {
		em.getTransaction().begin();
		Object object = em.find(Usuario.class, id);
		em.remove(object);   
		em.getTransaction().commit();
	}

}
