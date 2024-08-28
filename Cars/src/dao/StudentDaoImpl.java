package dao;

import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentDaoImpl implements StudentDao 
{

	static List<Student> lst = new ArrayList<>();
	static {
		
		lst.add(new Student(1,"vk"));
		lst.add(new Student (2,"pp"));
		lst.add(new Student (3, "ra"));
		lst.add(new Student (4, "ap"));
	}
	@Override
	public void display() {
		System.out.println(lst);
	}

	@Override
	public void add(int id, String name)
	{
		lst.add(new Student(id,name));
		
	}

	@Override
	public void search(int id) 
	{
		if(lst != null)
		{
			for (Student s : lst) 
			{
				if(id == s.getId()) 
				{
					System.out.println(s);
					//break;
				}
			}
		}else
			System.out.println("ID not Found");
			
	}

	@Override
	public List<Student> searchnm(String nm)
	{
		List<Student> lst1 = new ArrayList<>();
		
		for (Student s1 : lst ) {
			if (s1.getName().equals(nm)) {
				lst1.add(s1);
			}
		}
		return lst1;
		
	}
	
		
	
}

	
	

	
	