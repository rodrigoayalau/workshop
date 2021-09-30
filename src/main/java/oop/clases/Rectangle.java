package oop.clases;

public class Rectangle extends GeometricFigure{
	
	int base;
	int height;
	
	public Rectangle() {
		this.type = "rectangle";
	}

	public Rectangle(String type, int base, int height) {
		super(type);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void printFigure() {
		System.out.println("It is printing: " + this.getClass().getSimpleName());
	}
	
	@Override
	public int area() {
		return base * height;
	}

	@Override
	public String toString() {
		return super.toString() + " Rectangle [base=" + base + ", height=" + height + "]";
	}
	
	
	
	
}
