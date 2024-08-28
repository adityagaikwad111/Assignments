package service;

import java.util.List;

import bean.Student;

public interface StudentService {

	void displayAll();

	void addinfo();

	void searchById(int id);

	List<Student> searchByname(String nm);

	

}
