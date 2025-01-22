package objectExercise;

public class Apartment extends Property {
	private String floor;
	
	Apartment(String name, String lastName, String firstName, String type, int price, String floor) {
		super(name, lastName, firstName, type, price);
		this.floor = floor;
	}
	
	public String getFloor() {
		return this.floor;
	}
	
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	public void output() {
		super.output();
		System.out.println("間取り：" + getFloor());
		System.out.println("=============================");
	}
}
