
public class RegularPrice extends Price {

	public RegularPrice() {
		// TODO Auto-generated constructor stub
		this.type="Regular";
		this.ppt=150;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return ppt;
	}

}
