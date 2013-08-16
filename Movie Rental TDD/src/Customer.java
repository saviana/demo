
public class Customer {
	String name;
	int frequentRentalPoints;

	public Customer(){
		this.name="Peter";
		this.frequentRentalPoints=2;
	}
	
	public int getFrequentRentalPoints() {
		return frequentRentalPoints;
	}

	public void updateFrequentRentalPoints(int frequentRentalPoints) {
		this.frequentRentalPoints += frequentRentalPoints;
	}

	public String getName() {
		return name;
	}
}
