package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;

public class AbstractRepository <E> {
	protected EntityManager em;
	private Class entityClass;
	public AbstractRepository() {
		em = Persistence.createEntityManagerFactory("PU_AULA").createEntityManager();
		entityClass = (Class<E>)
				   ((ParameterizedType)getClass().getGenericSuperclass())
				      .getActualTypeArguments()[0];
	}
	public E find(Object id) {
		Object entity = em.find(entityClass, id);
		return (E) entity;
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
		Object entity = find(id);
		if(entity!=null) {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
		}
	}
	
	public List<E> list(){
		//Ver sobre JPQL + String.format
		String sql = String.format("SELECT e FROM  %s e", entityClass.getName());
		
		Query query =  em.createQuery(sql);
		
		return query.getResultList();
		
	}
	
//	public void save(E e) {
//		em.getTransaction().begin();
//		em.persist(e);
//		em.getTransaction().commit();
//	}
//	public void update(E e) {
//		em.getTransaction().begin();
//		em.merge(e);
//		em.getTransaction().commit();
//	}
//	
//	public void delete(Integer id) {
//		em.getTransaction().begin();
//		Object object = em.find(Usuario.class, id);
//		em.remove(object);   
//		em.getTransaction().commit();
//	}

}
