package labTerminalB;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase2 {

	@Test
	public void test() {
		
		Movie m1=new Movie("127 hours",1);
		Movie m2=new Movie("Wrong no 2",2);
		Customer c1=new Customer("Haris");
		Customer c2=new Customer("Rafay");
		Rental r1=new Rental(m1,10);
		Rental r2=new Rental(m2,10);
		
		c1.addRental(r1);
		c2.addRental(r2);
		
		String output1="Rental record for Haris\r\n" +
		"127 hours 10.0\r\n" +
		"Speed 20.0\r\n";
		if(output1.equals(c1.statement()))
		{
			assert true;
		}
	}

}
