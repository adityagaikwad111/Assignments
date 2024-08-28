package dao;

import java.util.List;

import bean.Student;

public interface StudentDao {

	void display();

	void add(int id, String name);

	

	void search(int id);

	List<Student> searchnm(String nm);

	

}
