
public class NewReleasePrice extends Price {
	
	public NewReleasePrice() {
		// TODO Auto-generated constructor stub
		this.type="NewRelease";
		this.ppt=200;
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
