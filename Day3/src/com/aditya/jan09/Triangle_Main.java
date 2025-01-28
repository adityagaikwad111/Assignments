package com.aditya.jan09;

import java.util.Scanner;

public class Triangle_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select an option on length of side you are providing: ");
		System.out.println("1. Side opposite to 30 degrees \n2. Side opposite to 60 degrees \n3. Side opposite to 90 degrees \n4. Exit");
		int choice = sc.nextInt();
		
		Triangle tri = new Triangle();
		
		do{
			switch(choice) {
				case 1:{
					System.out.println("Enter the length of side opposite to 30 degrees: ");
					double side_opp_30 = sc.nextDouble();
		
					double [] arr_for_30 = tri.findSidesfor30(side_opp_30);
					System.out.println("Side opposite to 60 degrees is: "+ arr_for_30[0] + " units");
					System.out.println("Side opposite to 90 degrees is: "+ arr_for_30[1] + " units");
					
					break;
				}
				
				case 2:{
					System.out.println("Enter the length of side opposite to 60 degrees: ");
					double side_opp_60 = sc.nextDouble();
					
					double [] arr_for_60 = tri.findSidesfor60(side_opp_60);
					System.out.println("Side opposite to 30 degrees is: "+ arr_for_60[0] + " units");
					System.out.println("Side opposite to 90 degrees is: "+ arr_for_60[1] + " units");
					
					break;				
				}
				
				case 3:{
					System.out.println("Enter the length of side opposite to 90 degrees: ");
					double side_opp_90 = sc.nextDouble();
					
					double [] arr_for_90 = tri.findSidesfor90(side_opp_90);
					System.out.println("Side opposite to 30 degrees is: "+ arr_for_90[0] + " units");
					System.out.println("Side opposite to 60 degrees is: "+ arr_for_90[1] + " units");
					
					break;
				}
				
				case 4:{
					System.out.println("Thank You!");
					break;
				}
				
				default:{
					System.out.println("Enter a valid choice");
				}
			}
			
		}while(choice!=4);
		sc.close();
	}

}
