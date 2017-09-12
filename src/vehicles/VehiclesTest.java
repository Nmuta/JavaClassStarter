package vehicles;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class VehiclesTest extends Vehicles{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@Test
	public void extensionTest() {
		Car hon = new Car("honda","accord",2009); 
		assertEquals(hon.revEngine(),"vrooom");
	}
	
	@Test
	public void superTest() {
		Car hon = new Car("honda","accord",2009); 
		assertEquals(hon.getUniqueId(),"ho2009");
	}
	
	@Test
	public void boatTest() {
		Boat boat = new Boat("silver","maroon",2015); 
		assertEquals(boat.getUniqueId(),"si2015");
	}
	
	
	@Test
	public void methodOverLoading() {
		Car car = new Car("jeep","cherokee",2015); 
		assertEquals(car.start(),"starting the car");
		assertEquals(car.start(true),"starting the car with 100.0 units of fuel");
		assertEquals(car.start(false),"starting the car with adequate fuel");
		assertEquals(car.start(125),"you do not have enough fuel to reach your destination");
	}
	
	@Test
	public void methodOverRiding() {
		Car hon = new Car("honda","accord",2009); 
		assertEquals(hon.initializeGPS(),"GPS for car is on");
		Boat boat = new Boat("silver","maroon",2015); 
		assertEquals(boat.initializeGPS(),"GPS for boat is on");
	}
	



}
