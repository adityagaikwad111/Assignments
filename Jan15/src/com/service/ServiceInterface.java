/*
 * An Interface defining the structure for adding, displaying and updating the Tasks
 */

package com.service;

import java.util.List;

import com.beans.Task;

public interface ServiceInterface {
	
	//Abstract method for adding a new Task
	void addTask();
	
	//Abstract method for displaying all the tasks
	List<Task> viewTasks();
	
	//Abstract method for updating a task
	void updateTask(int user_id);
}
