package beans;

public class Customer extends Person {
	private String adress;

	public Customer(int id, String name,String adress) {
		super(id, name);
		this.adress=adress;
	}

	@Override
	public String toString() {
		return super.toString()+"[adress=" + adress + "]";
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
