
public class Fruit extends Food {
	
	private String season;
	
	Fruit(){}
	
	Fruit(String description, double numCal, String season){
		super(description, numCal);
		this.season = season;
		
	}
	
	public String getSeason() {
		return this.season;
	}
	public void getSeason(String season) {
		this.season = season;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Fruit)) {
			return false;
		}
		
		Fruit f1 = (Fruit) o;
		
		return super.equals(o) && this.season.equals(f1.season);
	}
	

}
