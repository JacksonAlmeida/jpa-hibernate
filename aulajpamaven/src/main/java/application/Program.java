package application;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Person p = new Person(1, "Jackson Almeida", "jackson.almeida@gmail.com");
		Person p1 = new Person(2, "Jackson Rodrigues", "jackson.rodrigues@gmail.com");
		Person p2 = new Person(3, "Jackson Silva", "jackson.silva@gmail.com");
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
