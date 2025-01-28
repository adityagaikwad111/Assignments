/*
 * Main Class serves the entry point of the application 
 * This class handles user inputs and invokes the appropriate service methods in ServiceImpl class using an 
 * instance of ServiceImpl based on the user's choice presented using switch case  
 */

package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.ServiceImpl;

public class ProductMain {
		
	public int firstChoice(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an operation to perform: ");
		System.out.println("1. Add a product \n2. Display all products \n3. Exit");
		int first_choice = sc.nextInt();
		sc.close();
		return first_choice;		
	}
	
	public static void main(String[] args) {
		
		ProductMain prodmain = new ProductMain();
						
		int choice = 0;
		try {
			choice = prodmain.firstChoice();
		} catch (InputMismatchException e) {
			System.out.println("Enter integer value only");
			return;
		}
		
		//An instance of ServiceImpl class to access its methods
		ServiceImpl service_obj = new ServiceImpl();
							
		do{
			switch(choice) {
			case 1:{
				
				//Calls addnewProduct() method of ServiceImpl class with the help of it's instance				
				service_obj.addnewProduct();					
				break;
			}
			
			case 2:{
				
				//Calls displayProduct() method of ServiceImpl class with the help of it's instance
				service_obj.displayProduct();				
				break;
			}
			
			case 3:{
				break;
			}
			
			default:{
				System.out.println("Enter a valid choice");
				break;
				}			
			}		
		}while(choice == 3);				
		
	}
	
}
