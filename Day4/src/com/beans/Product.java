/* 
 * Represents a Product with an ID, Name and Quantity * 
 */

package com.beans;

public class Product {
	private int product_id;
	private String product_name;
	private int product_quantity;
	
	public Product() {
		super();
	}
		
	/*
	 * Constructs a product with specified ID, Name and Quantity 
	 * @param product_id: Unique identifier of the product
	 * @param product_name: Name of the product
	 * @param product_quantity: Quantity of the product 
	 */
	public Product(int product_id, String product_name, int product_quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_quantity = product_quantity;
	}
	
	/*
	 * returns the Product ID
	 * @return product_id
	 */
	public int getProduct_id() {
		return product_id;
	}
	
	
	/*
	 * sets the Product ID
	 * @param product_id the new Product ID
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	
	/*
	 * returns the Product Name
	 * @return product_name
	 */
	public String getProduct_name() {
		return product_name;
	}
	
	/*
	 * sets the Product Name
	 * @param product_name the new Product Name
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
		
	/*
	 * returns the Product Quantity
	 * @return product_quantity
	 */
	public int getProduct_quantity() {
		return product_quantity;
	}
	
	/*
	 * sets the Product Quantity
	 * @param product_quantity the new Product Quantity
	 */
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	
	/*
	 * returns a string representation of the product
	 * @return a string containing the Product ID, Name and Quantity
	 */
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_quantity="
				+ product_quantity + "]";
	}
}
