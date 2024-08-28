package test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnum {

	public static void main(String[] args) {
		
		Vector<String> v =  new Vector<>();
		
		v.add("Kasasaki");
		v.add("Ducati");
		v.add("BmW");
		v.add("Harly Davidson");
		v.add("Triumph");
		v.add("Beneli");
		
		
		Enumeration<String> e1 = v.elements(); 
		
		while(e1.hasMoreElements()) {
			String bike = e1.nextElement();
			System.out.println(bike);
		}
	}

}
