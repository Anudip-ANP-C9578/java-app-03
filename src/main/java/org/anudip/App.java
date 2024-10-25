package org.anudip;

import org.anudip.javaapp03.operation.TwoNonDecimalNumbersSubtraction;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
		
		int result1 = twoNonDecimalNumbersSubtraction.subtract(10,2);
		System.out.println(result1);
		
		int result2 = twoNonDecimalNumbersSubtraction.subtract(2,10);
		System.out.println(result2);
		
		int result3 = twoNonDecimalNumbersSubtraction.subtract(10,-2);
		System.out.println(result3);
		
		int result4 = twoNonDecimalNumbersSubtraction.subtract(-10,2);
		System.out.println(result4);
		
		int result5 = twoNonDecimalNumbersSubtraction.subtract(-10,-2);
		System.out.println(result5);
		
		int result6 = twoNonDecimalNumbersSubtraction.subtract(10,0);
		System.out.println(result6);
		
		int result7 = twoNonDecimalNumbersSubtraction.subtract(0,2);
		System.out.println(result7);
		
		int result8 = twoNonDecimalNumbersSubtraction.subtract(0,0);
		System.out.println(result8);
		
		
		
		
	}
}