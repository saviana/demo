
public class ChildrensPrice extends Price {

	public ChildrensPrice() {
		// TODO Auto-generated constructor stub
		this.type="Childrens";
		this.ppt=240;
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
