import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class InvoiceGeneratorTest {
	 @Test
	    public void givenDistanceAndTime_ShouldReturnTotalFare() {
	        InvoiceGenerator invoicegenerator = new InvoiceGenerator();
	        double distance = 2.0;
	        int time = 5;
	        double fare =invoicegenerator.calculateFare(distance,time);
	        Assertions.assertEquals(25, fare, 0.0);

	    }
	@Test
	public void givenDistanceAndTime_ShouldReturn_MinFare() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		 double distance = 0.1;
		 int time = 1;
		 double fare =invoicegenerator.calculateFare(distance,time);
		 Assertions.assertEquals(5, fare, 0.0);

	}
	
	@Test
	public void givenMultipleRides_ShouldReturn_InvoiceSummary() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
	    Ride[] rides = {new Ride(2.0 , 5),
	    				new Ride(0.1, 1)
	    			   };
	    
	   InvoiceSummary summary =  invoicegenerator.calculateFare(rides);
	  InvoiceSummary expectedInvoiceSummary =  new InvoiceSummary(2 , 30.0);
	   Assertions.assertEquals(expectedInvoiceSummary , summary);
	    }
}

