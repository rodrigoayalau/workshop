package udemy.clases;


public class Oracle implements IAccess{

	@Override
	public void insert() {
		System.out.println("insert from Oracle");

	}

	@Override
	public void read() {
		System.out.println("read from Oracle");

	}

	@Override
	public void update() {
		System.out.println("update from Oracle");

	}

	@Override
	public void delete() {
		System.out.println("delete from Oracle");

	}

}
