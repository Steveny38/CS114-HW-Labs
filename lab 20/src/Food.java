
public class Food {

	private String description;
	private double numCal;
	
	Food(){}
	
	Food(String description, double numCal){
		this.description = description;
		this.numCal = numCal;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCalories(double numCal) {
		this.numCal = numCal;
	}
	public String getDescription() {
		return description;
	}
	public double getCal() {
		return numCal;
	}
	
	public double servingCal(double servings) {
		return servings * numCal;
	}
	
	public String toString() {
		return "Food: " + "Description: " + this.description + " Calories per Serving: " + this.numCal;
	}
	
	public boolean equals(Object o) {
		
		if(!(o instanceof Food)) {
			return false;
		}
		
		Food f1 = (Food) o;
		return this.description.equals(f1.description) && this.numCal == f1.getCal();
	}
	
	
	public static void main(String[] args) {
		Food f1 = new Food("Chicken", 130);
		Food f2 = new Food("Chicken", 130);
		
		System.out.println(f1);
		System.out.println(f2.toString());
		System.out.println(f1.equals(f2));
		System.out.println(f1.servingCal(2));
		
		LiquidFood lf1 = new LiquidFood("Apple Juice", 120, 5.0);
		LiquidFood lf2 = new LiquidFood("Orange Juice", 110, 3.0);
		
		System.out.println(lf1);
		System.out.println(lf2);
		System.out.println(lf1.equals(lf2));
		
		Fruit fr1 = new Fruit("Apple", 50, "Salt");
		Fruit fr2 = new Fruit("Apple", 50, "Salt");
		System.out.println(fr1);
		System.out.println(fr2);
		System.out.println(fr1.equals(fr2));
		
		
		
	}
	
}
