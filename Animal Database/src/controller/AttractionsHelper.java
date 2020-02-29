package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Animals;
import model.Attractions;

public class AttractionsHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(""); //put database in here

	public void insertNewAttractions(Attractions at) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(at);
		em.getTransaction().commit();
		em.close();
	}

	public List<Attractions> getAttractions() {
		EntityManager em = emfactory.createEntityManager();
		List<Attractions> allAttractions = em.createQuery("SELECT at FROM Attractions at").getResultList();
		return allAttractions;
	}

}
