package vehicles;

public class Car {
	private static String planet = "Earth"; 
	private String my_make;
	private String my_model; 
	private int my_year; 
	
	public Car(String make, String model, int year){
		my_make = make; 
		my_model = model;
		my_year = year; 
	}
	
	public int getYear(){
		return my_year;
	}
	

}
