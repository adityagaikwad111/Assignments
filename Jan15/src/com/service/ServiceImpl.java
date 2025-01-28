/*
 * ServiceImpl class inherits from ServiceInterface interface and interacts with DaoImpl class
 * to manage task data
 */

package com.service;

import com.beans.Task;
import com.dao.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements ServiceInterface{
	Scanner sc = new Scanner(System.in);
	
	//An instance of DaoImpl class with a reference of DaoInterface interface to access its methods
	DaoInterface task_dao = new DaoImpl1();
	
	/*
	 * Implementation of addTask() method 
	 * This method collects the user input for the Task ID, Task, Time to complete the task and Date to complete the task
	 * and passes these values as an argument to the DaoImpl class for adding new task
	 */
	@Override
	public void addTask() {
		synchronized(this) {
			int task_id=0;
			String task="";
			String time_to_complete="";
			String date_to_complete="";
			
			try {
				
				System.out.println("Enter Task Number: ");
				task_id = sc.nextInt();
				
				System.out.println("Enter the task: ");
				task = sc.next();
				
				System.out.println("Enter time to complete the task in HH:mm format: ");
				time_to_complete = sc.next();
				LocalTime time_of_completion = LocalTime.parse(time_to_complete, DateTimeFormatter.ofPattern("HH:mm"));
				
				System.out.println("Enter date to complete the task in DD/MM/YYYY format: ");
				date_to_complete = sc.next();
				LocalDate date_of_completion = LocalDate.parse(date_to_complete, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				Task task1 = new Task(task_id,task,time_of_completion,date_of_completion);
				task_dao.addNewTask(task1);		
				
			} catch (InputMismatchException e) {
				System.out.println("Enter valid inputs");
				return;
			}
		}	
	}
	
	/*
	 * Implementation of viewTasks() method
	 * This method calls the display_all() method from DaoImpl class
	 * to retrieve and display the tasks
	 */
	@Override
	public List<Task> viewTasks() {
		synchronized(this) {
			return task_dao.display_all();
		}		
	}
	
	/*
	 * Implementation of updateTask() method
	 * This method calls the update() method from DaoImpl class
	 * to update a task by passing the user id as an argument 
	 */
	@Override
	public void updateTask(int user_id) {
		synchronized(this) {
			task_dao.update(user_id);
		}			
	}

}
