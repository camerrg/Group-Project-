package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Attractions;

public class AttractionHelper {

	static	EntityManagerFactory	emfactory	=	
			Persistence.createEntityManagerFactory("");	
	public void insertNewAttractions(Attractions at) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(at);
		em.getTransaction().commit();
		em.close();
	}
	public List<Attractions> getAttractions(){
		EntityManager em = emfactory.createEntityManager();
		List<Attractions> allAttractions = em.createQuery("SELECT a FROM Attractions a").getResultList();
		return allAttractions;
	}
}
