package com.aditya.jan9;

public class Triangle {
	private double side_opp_30;
	//private double side_opp_60;
	//private double side_opp_90;
	
	public Triangle(double side_opp_30) {
		super();
		this.setSide_opp_30(side_opp_30);
		findSidesOpp_30(side_opp_30);
	}
	
	private void findSidesOpp_30(double side_opp_30) {
		 
		double side_opp_90 = side_opp_30 * 2;
		double side_opp_60 = (side_opp_30 * Math.sqrt(3));
		
		System.out.println("Side opposite to 90 degrees is: "+ side_opp_90 + " units");
		System.out.println("Side opposite to 60 degrees is: "+ side_opp_60 + " units");		
	}

	public double getSide_opp_30() {
		return side_opp_30;
	}

	public void setSide_opp_30(double side_opp_30) {
		this.side_opp_30 = side_opp_30;
	}         
	
	
	
	
	
	
	
	

}
