package com.main;
import java.util.Scanner;

import com.service.*;

public class Gate_Entry_Main {

	public static void main(String[] args) {
		ServiceInterface serviceObj = new ServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nGate Entry Management");
			System.out.println("Choose an operation to perform:");
			System.out.println("1. Request entry for visitor \n2. Approve entry for visitor \n3. View all visitors history \n4. View visitors history flat-wise \n5. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				serviceObj.request_Entry_For_Visitor();
				break;
				}
			
			case 2:{
				serviceObj.approve_Entry_For_Visitor();
				break;
				}
			
			case 3:{
				serviceObj.view_Visitor_History();
				break;
				}
			
			case 4:{
				serviceObj.view_Visitors_Byflat();
				break;
				}
			
			case 5:{
				System.out.println("Thank You!");			
				break;
				}
			
			default:{
				System.out.println("Select a valid operation choice");
				break;
				}		
			}
			
		}
	}
}
