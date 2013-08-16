
public class Movie {

	private String name;
	Price price;
	
	public Movie(String name, Price price) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=price;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price.getPrice();
	}

	public String getType() {
		// TODO Auto-generated method stub
		return price.getType();
	}
	
	/**public int getPrice() {
		return price;
	}

	public int charge(int c) {
		// TODO Auto-generated method stub
		return c*price;
	}**/
	
	

}
