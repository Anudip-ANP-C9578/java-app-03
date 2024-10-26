package org.anudip;

import org.anudip.javaapp03.operation.TwoNonDecimalNumbersSubtraction;

public class App {
	public static void main(String[] args) {
		/* Creating an instance of TwoNonDecimalNumbersSubtraction */
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
		long result1 = twoNonDecimalNumbersSubtraction.subtract(10, 2); /*Calling the subtract method and printing the result*/																 
		System.out.println(result1);
		long result2 = twoNonDecimalNumbersSubtraction.subtract(2, 10);
		System.out.println(result2);
		long result3 = twoNonDecimalNumbersSubtraction.subtract(10, -2);
		System.out.println(result3);
		long result4 = twoNonDecimalNumbersSubtraction.subtract(-10, 2);
		System.out.println(result4);
		long result5 = twoNonDecimalNumbersSubtraction.subtract(-10, -2);
		System.out.println(result5);
		long result6 = twoNonDecimalNumbersSubtraction.subtract(10, 0);
		System.out.println(result6);
		long result7 = twoNonDecimalNumbersSubtraction.subtract(0, 2);
		System.out.println(result7);
		long result8 = twoNonDecimalNumbersSubtraction.subtract(0, 0);
		System.out.println(result8);
	}
}