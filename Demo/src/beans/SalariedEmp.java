package beans;

public class SalariedEmp extends Employe{
	private double salary;
	private double bonus;
	
	public SalariedEmp(int id, String name, String dept, String desg,double salary) {
		super(id, name, dept, desg);
		this.salary = salary;
		this.bonus = salary*0.10;
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+" [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
	
}
