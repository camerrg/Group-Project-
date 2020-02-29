package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Animals;


public class InsertAnimal {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(""); //put database in here

	public void insertAnimal(Animals a) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		em.close();
	}

	public List<Animals> showAllAnimal() {
		EntityManager em = emfactory.createEntityManager();
		List<Animals> allEmployee = em.createQuery("SELECT a FROM Animals a").getResultList();
		return allEmployee;
	}

}
