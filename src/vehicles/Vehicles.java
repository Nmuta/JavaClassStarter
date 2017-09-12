package vehicles;

public class Vehicles {
	
	public static Car hot_rod; 

	public static void main(String[] args) {
		Car simma = new Car("subaru","forrester",2008);
		System.out.println(simma.getUniqueId());
       
	}
	
	// TODO :  1. write a method called generateCar which accepts 
	// a make, model, and year and returns the year 
	// of the car after it's created. 
	public static int generateCar(String make, String model, int year){
		Car simma = new Car(make,model,year);
		System.out.println(simma.getUniqueId());
		return simma.getYear();
	}
	
	
	

}
