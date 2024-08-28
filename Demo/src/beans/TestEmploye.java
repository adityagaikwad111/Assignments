package beans;
import java.util.Scanner;
public class TestEmploye {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employe e = null;
		
		System.out.println("who are you:");
		System.out.println("1.SalariedEmp 2.contractEmp 3.Vendor");
		int choice = sc.nextInt();
		
		switch(choice) {
	
		case 1:
			System.out.println("Enter dept");
			String dept =sc.next();
			e=new SalariedEmp(1,"vedant",dept,"Manager",200000);
			
		break;
		case 2: e=new ContractEmp(2,"vitthal","Dev","BackEnd",5);
		break;
		case 3: e=new Vendor(3,"Vaibhav","Dev", "hr",10);
		break;
		default: 
			System.out.println("You are not belongs to this Company");
		break;
		}
		
		System.out.println(e);
		
	}

}
