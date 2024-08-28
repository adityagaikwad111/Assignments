package test;

import java.util.List;
import java.util.Scanner;

import bean.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class TestStudent
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StudentService ss = new StudentServiceImpl();
		int choice;
		
		do 
		{
		System.out.println("1.Display \n2.Add member \n3.Searach by ID \n4.Search by name ");
		 choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 :
			ss.displayAll();
			break;
		
		case 2 :
			ss.addinfo();
			break;
		case 3 :
			System.out.println("Enter id to search");
			int id = sc.nextInt();
			ss.searchById(id);
//		case 4 :
//			System.out.println("Enter name to search");
//			String nm = sc.next();
//			ss.searchByname(nm);
		case 4:
			System.out.println("Enter name to search");
			String nm = sc.next();
			List<Student> arr=ss.searchByname(nm);
			System.out.println(arr);
		}
		
		}while(choice != 0);
	sc.close();
	}

}
