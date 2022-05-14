package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Person p = new Person(null, "Jackson Almeida", "jackson.almeida@gmail.com");
		Person p1 = new Person(null, "Jackson Rodrigues", "jackson.rodrigues@gmail.com");
		Person p2 = new Person(null, "Jackson Silva", "jackson.silva@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		em.persist(p);
		em.persist(p1);
		em.persist(p2);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		
	}

}
