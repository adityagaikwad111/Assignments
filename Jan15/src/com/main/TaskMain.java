/*
 * Main Class serves the entry point of the application 
 * This class handles user inputs and invokes the appropriate abstract methods in ServiceInterface interface using an 
 * instance of ServiceImpl based on the user's choice presented using switch case  
 */

package com.main;

import com.beans.Task;
import com.service.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TaskMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Task Manager");
		System.out.println("Enter a choice for an operation to perform");
		int choice=0;
		try {
			System.out.println("1. Add a task \n2. View all tasks \n3. Update a task \n4. Exit");
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter choice in integers only");
			sc.close();
			return;
		}
		
		//An instance of ServiceImpl class with a reference of ServiceInterface interface to access its methods
		ServiceInterface task_service = new ServiceImpl();
		
		String choice1;
		do {
			switch(choice) {
			case 1:{
				
				//Calls addTask() method of ServiceImpl class with the help of it's instance
				task_service.addTask();											
				break;
			}
			
			case 2:{
				
				/*Calls viewTasks() method of ServiceImpl class with the help of it's instance
				 * and stores the retrieved list in display_tasks
				 */
				List <Task> display_tasks = task_service.viewTasks();
				
				System.out.println(display_tasks);
				break;
			}
			
			case 3:{
				
				/*Calls viewTasks() method of ServiceImpl class with the help of it's instance
				 * and passes user_id as an argument taken from the user
				 */
				System.out.println("Enter the Task ID you want to update: ");
				int user_id = sc.nextInt();
				task_service.updateTask(user_id);			
				break;
			}
			
			case 4:{
				break;
			}
			
			default:{
				System.out.println("Enter a valid choice");
				break;
				}			
			}
			System.out.println("Do you want to contiunue? y/n");
			choice1 = sc.next();
		}while(choice1 == "y");
		
		sc.close();
	}

}
