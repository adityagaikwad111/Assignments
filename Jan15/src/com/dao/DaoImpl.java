/*
 * DaoImpl class implements the abstract methods defined in DaoInterface interface and is responsible
 * for managing data
 */

package com.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.beans.Task;

public class DaoImpl implements DaoInterface{	
	 
	//Static ArrayList to store products
	 static Task task1 = new Task(1,"Wake up",LocalTime.of(6, 0),LocalDate.of(2025,01,17));
	 static Task task2 = new Task(2,"Work out",LocalTime.of(6, 30),LocalDate.of(2025,01,16));
	 static List <Task> task_list;
	 {
		task_list = new ArrayList <>();
		task_list.add(task1);
		task_list.add(task2);
	}
	
	/*
	* Implementation of addNewTask() method which adds the instance of Task to the ArrayList
	*/
	@Override
	public void addNewTask(Task task1) {
		synchronized(this) {
			task_list.add(task1);
			System.out.println(task1);
			return;
		}		
	}
	
	/*
	 * Implementation of display_all() method which returns the entire ArrayList
	 */
	@Override
	public List<Task> display_all() {
		synchronized(this) {
			return task_list;
		}	
	}
	
	/*
	 * Implementation of update() method which updates the existing task
	 */
	@Override
	public void update(int user_id) {
		synchronized(this) {
			Scanner sc = new Scanner(System.in);
			for(Task task : task_list) {
				if(task.getTask_id() == user_id) {
					String updated_task;
					try {
						System.out.println("Enter the updated task: ");
						updated_task = sc.next();
						
						System.out.println("Enter time to complete the task in HH:mm format: ");
						String updated_time_to_complete = sc.next();
						LocalTime updated_time = LocalTime.parse(updated_time_to_complete, DateTimeFormatter.ofPattern("HH:mm"));
						
						System.out.println("Enter date to complete the task in DD/MM/YYYY format: ");
						String updated_date_to_complete = sc.next();
						LocalDate updated_date = LocalDate.parse(updated_date_to_complete, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
						
						task.setTask(updated_task);
						task.setTime_of_completion(updated_time);
						task.setDate_of_completion(updated_date);
						
						System.out.println("Task updated successfully");
						System.out.println(task_list);				
						sc.close();
						return;
						
					} catch (InputMismatchException e) {
						System.out.println("Enter valid inputs only");
						return;
					}
					
				}
				else{
					System.out.println("Task not found, try with another ID");
					sc.close();
					return;
				}
			}
			sc.close();		
		}		
	}			
}


