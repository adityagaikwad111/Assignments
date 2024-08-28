package beans;

public class ContractEmp extends Employe {
	private int charges;
	private int hrs;
	public ContractEmp(int id, String name, String dept, String desg,int hrs) {
		super(id, name, dept, desg);
		this.hrs = hrs;
		this.charges = 100*hrs;
		
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [charges=" + charges + ", hrs=" + hrs + "]";
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	

}
