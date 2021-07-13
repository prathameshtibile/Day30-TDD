
public class InvoiceSummary {
	private final int numofRides;
    private final double totalFare;
    private final double averageFare;
	public InvoiceSummary(int numofRides, double totalFare) {
		this.numofRides = numofRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.numofRides;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if (Double.doubleToLongBits(averageFare) != Double.doubleToLongBits(other.averageFare))
			return false;
		if (numofRides != other.numofRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}
	
	

}
