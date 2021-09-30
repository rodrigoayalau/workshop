package udemy.main;


import java.util.ArrayList;
import java.util.List;

import udemy.clases.Client;
import udemy.clases.GeometricFigure;
import udemy.clases.IAccess;
import udemy.clases.Oracle;
import udemy.clases.Person;
import udemy.clases.Rectangle;
import udemy.clases.SQL;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> clientList = new ArrayList<String>();
		
		Person p1 = new Person();
		p1.setName("Rodrigo");
		p1.setLastname("Ayala");
		p1.setAge(30);
		System.out.println(p1);
	
		printDetails(p1);
		
		// Encapsulation
		Person p2 = new Person();
		p2.setName("Maria Jose");
		p2.setLastname("Gonzalez");
		p2.setAge(28);
		System.out.println(p2);
		
		// Prints toString() method
		Person p3 = new Person("Alberto", "Ayala", 'm', 40, 3000.00);
		p3.showInformation();
		p3.showInformation("Alberto", "Ayala", 40);
		System.out.println(p3);
		
		// Overriding
		Client c1 = new Client("Maria", true);
		System.out.println(c1.details());
	
		clientList.add(c1.getName());
		
		// Polymorphism
		Client c2 = new Client("Gabriela", false);
		printDetails(c2);
		clientList.add(c2.getName());
		
		System.out.println(clientList);
		
		//Abstract
		GeometricFigure rectangle = new Rectangle("rectangle",4,2);
		rectangle.printFigure();
		System.out.println(rectangle.area());
		System.out.println(rectangle);
		
		String word = "Hello World";
		StringBuilder input = new StringBuilder();
		input.append(word);
		input.reverse();
		System.out.println(input);
		
		IAccess data = new SQL();
		data.insert();
		
		IAccess data1 = new Oracle();
		printAccess(data1);
		
		int ages [] = new int[3];
		ages[0] = 1;
		ages[1] = 2;
		ages[2] = 3;
		System.out.println(ages.length);
		
		for(int i=0; i < ages.length; i++) {
			System.out.println(i);
		}
	}
	
	public static void printDetails(Person person) {
		System.out.println(person.details());
	}
	
	// Polymorphism with Interfaces
	public static void printAccess(IAccess data) {
		data.delete();
	}
	
	

}
