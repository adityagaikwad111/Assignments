package service;

import java.util.List;
import java.util.Scanner;

import bean.Student;
import dao.StudentDao;
import dao.StudentDaoImpl;


public class StudentServiceImpl implements StudentService {

	Scanner sc = new Scanner(System.in);
	//private StudentDao sdao;
	StudentDao sdao = new StudentDaoImpl();
	@Override
	public void displayAll() {
		sdao.display();
		
	}
	@Override
	public void addinfo() {
		System.out.println("enter Id");
		int id = sc.nextInt();
		System.out.println("enter Name");
		String name = sc.next();
		
		sdao.add(id,name);
		
	}
	
	@Override
	public void searchById(int id) {
		
		sdao.search(id);
	}
	@Override
	public List<Student> searchByname(String nm) {
		
		return sdao.searchnm(nm);
		
	}

	

}
