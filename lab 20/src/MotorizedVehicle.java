
public class MotorizedVehicle extends Vehicle{
	private double engineVolumeDisplacement;
	
	public MotorizedVehicle(String ownerName, int numWheels, double engineVolumeDisplacement) {
		super(ownerName, numWheels);
		
		this.engineVolumeDisplacement = engineVolumeDisplacement;
	}
	
	public void setEngineVolumeDisplacement(double engineVolumeDisplacement) {
		 this.engineVolumeDisplacement = engineVolumeDisplacement;
	}
	
	public double computeHorsePower() {
		return engineVolumeDisplacement * getNumWheels();
	}
	
	public String toString() {
		return super.toString() + " displacement: " + this.engineVolumeDisplacement;
	}
	
	public boolean equals(Object o) {
		if(!(super.equals(o))) {
			return false;
		}
		
		MotorizedVehicle m = (MotorizedVehicle) o;
		
		if(Double.compare(engineVolumeDisplacement, m.engineVolumeDisplacement)== 0){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
