package day3;

import java.util.Iterator;

public class Leapyear {
	
	public static void main(String[] args) {
		
		

		
		for (int year=2000;year<=2100;year++) {
			if (year %4==0) {
				System.out.println("year "+year +" is leap year");
				
			}else {
				System.out.println("year "+year +" is not a leap year");
			}
		}
		
		
		
	}

}
