package vehicles;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class VehiclesTest extends Vehicles{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	public void generate_carTest() {
		assertEquals(generateCar("honda","accord",2009),2009);
	}
	



}
