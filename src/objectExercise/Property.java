package objectExercise;

public class Property {
	private String name;
	private String lastName;
	private String firstName;
	private String type;
	private  int price;
	
	Property(String name, String lastName, String firstName, String type, int price) {
		this.name = name;
		this.lastName = lastName;
		this.firstName = firstName;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getOwner() {
		return this.lastName + " " + this.firstName;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	protected void output() {
		System.out.println("=============================");
		System.out.println("物件名：" + this.getName());
		System.out.println("物件所有者名：" + this.getOwner());
		System.out.println("物件種別：" + this.getType());
		System.out.println("物件価格：" + this.getPrice() + "円");
	}
}
