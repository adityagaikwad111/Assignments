/*
 * This interface provides method definitions for adding, displaying and updating the tasks
 * 
 */

package com.dao;

import java.util.List;

import com.beans.Task;

public interface DaoInterface {
	
	//Abstract method for adding a new task which passes an object of Task as an argument
	void addNewTask(Task task1);
	
	//Abstract method for displaying all the tasks 
	List<Task> display_all();
	
	//Abstract method for updating a task which passes user_id as an argument
	void update(int user_id);
}
