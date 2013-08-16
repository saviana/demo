
public class AllClasses {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust = new Customer();
		Price newrelease = new NewReleasePrice();
		Movie mrmovie = new Movie("Thor", newrelease);
		MovieRental movierental = new MovieRental(mrmovie, 10, cust);
		System.out.println("Customer Name: "+ movierental.getCustName());
		System.out.println("Customer Points: "+ movierental.getpoints());
		System.out.println("Customer Movie Name: "+ movierental.getMovieName());
		System.out.println("Customer Movie Type: "+ movierental.getType());
		System.out.println("Total Amount: "+ movierental.calculate());
		System.out.println("Customer Updated Points: "+ movierental.getpoints());
		
		System.out.println("<html><body><p><b>Customer Name: </b>"+ movierental.getCustName()+"</p>");
		System.out.println("<p><b>Customer Points: </b>"+ movierental.getpoints()+"</p>");
		System.out.println("<p><b>Customer Movie Name: </b>"+ movierental.getMovieName()+"</p>");
		System.out.println("<p><b>Customer Movie Type: </b>"+ movierental.getType()+"</p>");
		System.out.println("<p><b>Total Amount: </b>"+ movierental.calculate()+"</p>");
		System.out.println("<p><b>Customer Updated Points: </b>"+ movierental.getpoints()+"</p></body></html>");
	}


	
}
