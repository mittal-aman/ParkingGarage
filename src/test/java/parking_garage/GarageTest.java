package parking_garage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GarageTest {

	Garage garage;
	double inTime;
	double outTime;
	double totalTime;
	@Before
	public void setup() {
		 garage = new Garage();
		 inTime = 2.45;
		 outTime = 5.22;
	}
	@Test
	public void testCalTime() {
		//expected
		double expected = 3.00;
		
		//actual
		double actual = garage.CalTime(inTime,outTime);
		
		assertEquals(expected, actual,0.0);
		
	}
	
	@Test
	public void testCalTime1() {
		//expected
		 inTime = 5.45;
		 outTime = 2.22;
		double expected = -1;
		
		//actual
		double actual = garage.CalTime(inTime,outTime);
		
		assertEquals(expected, actual,0.0);
		
	}
	
	@Test
	public void testCalCharge() {
		 inTime = 2.12;
		 outTime = 11.12;
		totalTime = garage.CalTime(inTime,outTime);
		
		//expected
		int expected = 0;
		
		//actual
		double actual = garage.CalCharge(totalTime,true);
		
		assertEquals(expected, actual,0.0);
		
	}
	
	
	@Test
	public void testCalCharge2() {
		totalTime = garage.CalTime(inTime,outTime);
		
		//expected
		int expected = 15;
		
		//actual
		double actual = garage.CalCharge(totalTime,false);
		
		assertEquals(expected, actual,0.0);
		
	}

}
