
public class LiquidFood extends Food {
	private double viscosity;
	
	LiquidFood(){
		
	}
	
	LiquidFood(String description, double numCal, double viscosity){
		super(description, numCal);
		this.viscosity = viscosity;
	}
	
	public double getVisocity() {
		return this.viscosity;
	}
	
	public void setVisocity(double viscosity) {
		this.viscosity = viscosity;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof LiquidFood)) {
			return false;
		}
		
		LiquidFood lf = (LiquidFood) o;
		
		return this.getDescription().equals(lf.getDescription()) && this.getCal() == lf.getCal() && this.viscosity == lf.getVisocity();
	}
	
	public String toString() {
		return super.toString() + " Viscosity: " + this.viscosity;
	}
	
}
