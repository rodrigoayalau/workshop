package oop.clases;

public class Client extends Person{
	
	private int idClient;
	private boolean active;
	
	public String clientsArray[];
	
	public Client(String name, boolean active) {
		super(name);
		this.idClient = counterPerson;
		this.active = active;
	}

	public int getIdClient() {
		return idClient;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String details() {
		return super.details() + ", " + this.idClient + ", " + this.active;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + this.name + ", active=" + active + "]";
	}
	
	
	
	
	
	
	
	
}
