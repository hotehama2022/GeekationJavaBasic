package objectExercise;

public class Land extends Property {
	private double extent;
	
	Land(String name, String lastName, String firstName, String type, int price, double extent) {
		super(name, lastName, firstName, type, price);
		this.extent = extent;
	}
	
	public Double getExtent() {
		return this.extent;
	}
	
	public void setExtent(double extent) {
		this.extent = extent;
	}
	
	public void output() {
		super.output();
		System.out.println("広さ：" + getExtent() + "㎡");
		System.out.println("=============================");
	}
}
