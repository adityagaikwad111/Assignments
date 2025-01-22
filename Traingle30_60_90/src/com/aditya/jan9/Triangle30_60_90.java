/*
 * A small application to calculate two sides of a 30-60-90 triangle when given a side opposite to 30 degrees.
 */

package com.aditya.jan9;

import java.util.Scanner;

class Triangle30_60_90 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);                 
		
		System.out.println("Enter the length of side opposite to 30 degrees: ");
		
		int side_30 = sc.nextInt();                                 
		
		Triangle tri30_obj = new Triangle(side_30);                    
		
		sc.close();
		
	}
}
