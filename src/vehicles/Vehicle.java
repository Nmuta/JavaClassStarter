package vehicles;

public abstract class Vehicle {
	protected static String planet = "Earth"; 
	protected String my_make;
	protected String my_model;
	protected int my_year;
	protected double fuel_amount;
	protected String message;
	protected String vehicle_type;
	
	public Vehicle(){}
	
	public Vehicle(String make, String model, int year){
		this.my_make = make;
		this.my_model = model;
		this.my_year = year;
	}
	
	public String getUniqueId(){
		String make_digits = this.my_make.substring(0,2); 
		String year_digits = Integer.toString(this.my_year); 
		return make_digits + year_digits; 
	}
	
	public String revEngine(){
       return "vrooom"; 
	}
	
	public String initializeGPS(){
	       return "GPS started"; 
		}
	

}
