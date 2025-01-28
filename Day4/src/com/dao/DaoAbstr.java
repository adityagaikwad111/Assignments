/*
 * This abstract class provides method definitions for adding and displaying products
 * 
 */
package com.dao;

public abstract class DaoAbstr {
	
	/*
	 * Abstract method definition to add product 
	 * This method takes the Product ID, Product Name and Product Quantity as the method parameters
	 * 
	 * @param product_id: Unique identifier of the product
	 * @param product_name: Name of the product
	 * @param product_quantity: Quantity of the product
	 */
	public abstract void addProduct(int product_id, String product_name,int product_quantity);
	
	
	//Abstract method for displaying all products
	public abstract void display_prod();
	
	
}
