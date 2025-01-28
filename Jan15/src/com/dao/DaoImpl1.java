package com.dao;

//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.io.FileWriter;
import java.util.List;

import com.beans.Task;

public class DaoImpl1 implements DaoInterface{
	
	File file = new File("data_storage.txt");
	ObjectOutputStream obj_output = null;
	

	@Override
	public void addNewTask(Task task1) {
		try {
			obj_output = new ObjectOutputStream(new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Task> display_all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int user_id) {
		// TODO Auto-generated method stub
		
	}

}
