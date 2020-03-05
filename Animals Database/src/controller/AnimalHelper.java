package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Animal;


public class AnimalHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("zoo");

	public void insertAnimal(Animal s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}

	public List<Animal> showAllAnimal() {
		EntityManager em = emfactory.createEntityManager();
		List<Animal> allAnimal = em.createQuery("SELECT s FROM Animal s").getResultList();
		return allAnimal;
	}
}
