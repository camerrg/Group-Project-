package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Attractions;
import model.ListItems;

public class ListDetailsHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("zoo");

	public void insertNewListDetails(Attractions s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}

	public List<Attractions> getLists() {
		EntityManager em = emfactory.createEntityManager();
		List<Attractions> allDetails = em.createQuery("SELECT d FROM Animals d").getResultList();
		return allDetails;
	}

	public void deleteList(Attractions toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Attractions> typedQuery = em
				.createQuery("select	li	from Attractions	li	where	li.id	=	:id	", Attractions.class);
		// Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("id", toDelete.getId());

		// we only want one result
		typedQuery.setMaxResults(1);
		// get the result and save it into a new list item
		Attractions result = typedQuery.getSingleResult();
		// remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	// TODO Auto-generated method stub
	public Attractions searchForListById(int idToEdit) {
//			TODO	Auto-generated	method	stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Attractions found = em.find(Attractions.class, idToEdit);
		em.close();
		return found;

	}
}
