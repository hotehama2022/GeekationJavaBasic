package objectExercise;

public abstract class Property {
	private String name;
	private String owner;
	private String type;
	private String price;
	
	Property(String name, String owner, String type, String price) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
}
