/*
 * ServiceImpl class inherits from abstract ServiceAbstr class and interacts with DaoImpl class
 * to manage product data
 */

package com.service;

import java.util.Scanner;
import com.dao.DaoImpl;

public class ServiceImpl extends ServiceAbstr {
	
	// Instance of DaoImpl has been created to access methods from DaoImpl class
	public DaoImpl dao_obj = new DaoImpl();
	 	
	/*
	 * Implementation of addnewProduct() method 
	 * This method collects the user input for the Product ID, Product Name and Product Quantity
	 * and passes these values as an argument to the DaoImpl class for adding new product
	 */
	public void addnewProduct(){	

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter Product ID: ");
		int product_id = sc.nextInt();
		
		System.out.println("Enter Product Name: ");
		String product_name = sc.next();
		
		System.out.println("Enter Product Quantity: ");
		int product_quantity = sc.nextInt();
			
		sc.close();
			
		dao_obj.addProduct(product_id, product_name,product_quantity);	
	}
	
	/*
	 * Implementation of displayProduct() method
	 * This method calls the display_prod() method from DaoImpl class
	 * to retrieve and display the products
	 */
	public void displayProduct() {
		dao_obj.display_prod();	
	}
	

}
