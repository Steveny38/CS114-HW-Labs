//Steven Yan
//115780161
public class RecipeIngredient extends Ingredient{

	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
		
	}
	
	public float getQuantity() {
		return this.quantity;
	}
	
	public void setQuanitity(float quantity) {
		this.quantity = quantity;
	}
	
	
	public boolean equals(Object o) {
		if(!(o instanceof RecipeIngredient)) {
			return false;
		}
		
		RecipeIngredient newO = (RecipeIngredient) o;
		
		return this.getName().equals(newO.getName()) && this.getMeasuringUnit().equals(newO.getMeasuringUnit()) && this.getCaloriesPerUnit() == newO.getCaloriesPerUnit() && this.getQuantity() == newO.getQuantity();
		
	}
	public String toString() {
		return "RecipeIngredient\n" + "name= " + this.getName() + "\n" + "measuringUnit= " + this.getMeasuringUnit() + "\n" + "caloriesPerUnit= " + this.getCaloriesPerUnit()  + "\n" + "quantity= " + this.quantity;
	}
	
	
}
