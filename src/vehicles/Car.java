package vehicles;

//TODO: 1. make the Car class extend the Vehicle class. 
public class Car  {

	protected boolean AWD = false; 
	
	
	//TODO : 2. after you've extended the Vehicle class, use the super keyword 
	// to inherit the variable connections from the Vehicle class. 
	public Car(String make, String model, int year){
		
		this.vehicle_type = "car";
		this.fuel_amount = 100.00;
	}
	
	public int getYear(){
		return this.my_year;
	}
	
	// TODO: 4. There is currently only one start method. 
	// using METHOD OVERLOADING, write two additional start methods: 
	
	// the second start method accepts a boolean .  
	// If true, when starting the car, the 2nd method will return
	// this exact String: 
	// "starting the car with "+this.fuel_amount+" units of fuel"
	// if false, when starting the car, the method will return 
	// "starting the car with adequate fuel";
	
	// the third method will accept an integer called destination. 
	// Assuming one unit of fuel will take you one distance measurement, 
	// if the current car instance's fuel amount is less than the distance measurement, 
	// return this exact String: 
	// "you do not have enough fuel to reach your destination"
	// else return this exact String: 
	// "you have enough fuel to reach your destination"
	
	public String start(){
		return "starting the car"; 
	}
	
	
	// TODO: 5:  Override the initializeGPS() in Car
	// so that it returns this exact String: 
	// "GPS for car is on".  Do the same for the boat class where it returns: 
	// "GPS for boat is on". 
	
 
	
 
	
 
	
	public String stop(){
		return "stopping the car"; 
	}
	
	public void toggleAWD(){
		this.AWD = !this.AWD;
	}
	
	public boolean getAWDStatus(){
		return this.AWD;
	}
	

	
}

//TODO: 3: In Eclipse, right click on  Car.java in the Project Explorer (
// you may have to re-enable it by going to Window --> Show View --> Project Explorer 
// Copy the Car class.  Paste it and rename it to "Boat" as you Paste. 
// Open the Boat class. Everything in Car has been re-named to Boat! 
// This should allow the third test, 'boatTest', to pass. 


