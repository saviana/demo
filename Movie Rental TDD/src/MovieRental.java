
public class MovieRental {

	private int no_of_days;
	private Movie movie;
	private Customer customer;

	public MovieRental(Movie m,int days, Customer cust) {
		// TODO Auto-generated constructor stub
		this.movie=m;
		this.no_of_days=days;
		this.customer=cust;
	}

	public int calculate() {
		int total;
		total=(movie.getPrice())*no_of_days;
		customer.updateFrequentRentalPoints(no_of_days);
		return total;
	}

	public String getCustName() {
		// TODO Auto-generated method stub
		return customer.getName();
	}

	public int getpoints() {
		// TODO Auto-generated method stub
		return customer.getFrequentRentalPoints();
	}

	public String getMovieName() {
		// TODO Auto-generated method stub
		return movie.getName();
	}

	public String getType() {
		// TODO Auto-generated method stub
		return movie.getType();
	}

}
