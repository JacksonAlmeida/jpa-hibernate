package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");	
		EntityManager em = emf.createEntityManager();
		

		Person p = em.find(Person.class, 1);
		
		System.out.println(p);
		
		emf.close();
		em.close();
		
	}

}
