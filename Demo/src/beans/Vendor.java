package beans;

public class Vendor extends Employe {
	private int noEmp;
	
	public Vendor(int id, String name, String dept, String desg,int noEmp) {
		super(id, name, dept, desg);
		// TODO Auto-generated constructor stub
		this.noEmp = noEmp;
	}

	@Override
	public String toString() {
		return super.toString()+"[noEmp=" + noEmp + "]";
	}

	public int getNoEmp() {
		return noEmp;
	}

	public void setNoEmp(int noEmp) {
		this.noEmp = noEmp;
	}
}