/*
 * DaoImpl class implements the abstract method defined in DaoAbstr class and is responsible
 * for managing data
 */

package com.dao;

import com.beans.Product;

public class DaoImpl extends DaoAbstr{
	
	//Static array to store products
	static Product [] product_arr = new Product[5];
	static {	
	product_arr [0] = new Product(1,"Lenevo",5); 
	product_arr [1] = new Product(2,"HP",6);
	}
	
	int prod_index = 1;
	
	/*
	 * Implementation of addProduct() method
	 * addProduct() method takes the Product ID, Product Name, Product Quantity as parameters and stores the values
	 * in the next available index of the array
	 * 
	 * @param product_id: Unique identifier of the product
	 * @param product_name: Name of the product
	 * @param product_quantity: Quantity of the product
	 */
	public void addProduct(int product_id, String product_name,int product_quantity) {
		
		prod_index++;
		product_arr [prod_index] = new Product(product_id, product_name,product_quantity);		
		System.out.println("Product entered successfully!");
		
		for(Product prod : product_arr) {
			System.out.println(prod);
		}
	}
	
	/*
	 * Implementation of display_prod() method
	 */
	public void display_prod() {
		
		//Creating a new array to store the products
		Product[] product_arr2 = DaoImpl.product_arr;
		
		//Looping through the product_arr2 array to display each product
		for(Product prod1 : product_arr2) {
			System.out.println(prod1);
			}
		}
	}

