package test;

import java.util.Scanner;

import bean.Grade;

public class Marks {

	public static void main(String[] args) {
		
		Grade g = null;
		Scanner sc = new Scanner(System.in);
		String choice;
		
		System.out.println("Enter Choice : \nA. Distingtion \nB. first \nC.Second \nD.Pass \nF.Fail");
		 choice = sc.next();
		
		switch(choice) {
		case "A" :
			g = Grade.Distinction;
			break;
		case "B" :
			g= Grade.First;
			break;
		case "C" :
			g = Grade.Second;
			break;
		case "D" :
			g = Grade.Pass;
			break;
		case "F" : 
			g = Grade.Fail;
			break;
		default :
			System.out.println("Enter Valid Grade");
			break;
		}
		System.out.println(g);
		System.out.println("Min passing marks : "+ g.getMin());
		System.out.println("Max Marks : "+g.getMax());
		
	}

}
