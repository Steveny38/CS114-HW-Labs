//Steven Yan
//115780161

public class Ingredient {
	
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;
	
	Ingredient(){}
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMeasuringUnit() {
		return this.measuringUnit;
	}
	
	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}
	
	public int getCaloriesPerUnit() {
		return this.caloriesPerUnit;
	}
	
	public void setCaloriesPerUnit(int caloriesPerUnit) {
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Ingredient)) {
			return false;
		}
		Ingredient newO = (Ingredient) o;
		return this.name == newO.getName() && this.measuringUnit == newO.getMeasuringUnit() && this.caloriesPerUnit == newO.getCaloriesPerUnit();
	}
	
	public String toString() {
		return "Ingredient\n"+ "name= " + name + "\n" + "measuringUnit= " + measuringUnit + "\n" + "caloriesPerUnit= " + caloriesPerUnit;
	}
	
	
}
