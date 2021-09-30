package oop.clases;


public class Person {
	// Attributes
	private int IdPerson;
	protected String name;
	protected String lastname;
	protected char genre;
	protected int age;
	protected double salary;
	protected static int counterPerson;

	// Constructors
	public Person() {
		System.out.println("Executing Constructor...");
		Person.counterPerson++;
		this.IdPerson = Person.counterPerson;
	}

	public Person(String name, String lastname, char genre, int age, double salary) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.genre = genre;
		Person.counterPerson++;
		this.IdPerson = Person.counterPerson;
		// System.out.println("My name is: " + name + " lastname " + "I am " + age + "My salary: " + "salary");
	}
	
	public Person(String name) {
		this.name = name;
		this.IdPerson = Person.counterPerson++;
	}

	// Methods
	public void showInformation() {
		System.out.println("Name: " + name);
		System.out.println("Lastname: " + lastname);
		System.out.println("Age: " + age);
	}

	public void showInformation(String name, String lastname, int age) {
		System.out.println("Name: " + name + " " + lastname + ", " + age);
	}

	public int getIdPerson() {
		return IdPerson;
	}

	public void setIdPerson(int idPerson) {
		IdPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCountPerson() {
		return counterPerson;
	}

	public static void setCountPerson(int countPerson) {
		Person.counterPerson = countPerson;
	}
	
	public String details() {
		return "From class Person: " + this.name;
	}

	@Override
	public String toString() {
		return "Person [IdPerson=" + this.IdPerson + ", name=" + name + ", lastname=" + lastname + ", age=" + age
				+"]";
	}
	
	
	
	
	
}
