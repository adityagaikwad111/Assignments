package com.aditya.jan09;

public class Triangle {
	
	
	double [] findSidesfor30(double side_opp_30) {
		
		double side_opp_90 = side_opp_30 * 2;
		double side_opp_60 = (side_opp_30 * Math.sqrt(3));
	
		return new double [] {side_opp_60, side_opp_90};	
	}

	double[] findSidesfor60(double side_opp_60) {
		
		double side_opp_30 = side_opp_60/Math.sqrt(3);
		double side_opp_90 = side_opp_30 * 2;
		
		return new double [] {side_opp_30, side_opp_90};
			
	}

	double [] findSidesfor90(double side_opp_90) {
		
		double side_opp_30 = side_opp_90/2;
		double side_opp_60 = (side_opp_30 * Math.sqrt(3));
		
		return new double [] {side_opp_30, side_opp_60};
	}
	
}
