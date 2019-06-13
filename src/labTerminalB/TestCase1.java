package labTerminalB;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() {
		Movie m1=new Movie("Commando",1);
		Movie m2=new Movie("Mission Impossible",2);
		Customer c1=new Customer("Hashaam");
		Customer c2=new Customer("Ali");
		Rental r1=new Rental(m1,10);
		Rental r2=new Rental(m2,10);
		
		c1.addRental(r1);
		c2.addRental(r2);
		
		String output1="Rental record for Hashaam\r\n" +
		"Commando 10.0\r\n" +
		"Speed 20.0\r\n";
		if(output1.equals(c1.statement()))
		{
			assert true;
		}
	} 

}
