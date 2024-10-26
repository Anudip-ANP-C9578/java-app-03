package org.anudip;

import org.anudip.javaapp03.operation.TwoNonDecimalNumbersSubtraction;

public class App { // class declaration 
	public static void main(String[] args) {// defining a method{
		TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();//creating object of the class
		
		//calling a object of class by passing parameters 10 and 2
		int result1 = twoNonDecimalNumbersSubtraction.subtract(10,2);
		System.out.println(result1);
		
		//calling a object of class by passing parameters 2 and 10
		int result2 = twoNonDecimalNumbersSubtraction.subtract(2,10);
		System.out.println(result2);
		
		//calling a object of class by passing parameters 10 and -2
		int result3 = twoNonDecimalNumbersSubtraction.subtract(10,-2);
		System.out.println(result3);
		
		//calling a object of class by passing parameters -10 and 2
		int result4 = twoNonDecimalNumbersSubtraction.subtract(-10,2);
		System.out.println(result4);
        
		//calling a object of class by passing parameters -10 and -2
        int result5 = twoNonDecimalNumbersSubtraction.subtract(-10,-2);
		System.out.println(result5);
		
		//calling a object of class by passing parameters 10 and 0
		int result6 = twoNonDecimalNumbersSubtraction.subtract(10,0);
		System.out.println(result6);
		
		//calling a object of class by passing parameters 0 and 2
		int result7 = twoNonDecimalNumbersSubtraction.subtract(0,2);
		System.out.println(result7);
		
		//calling a object of class by passing parameters 0 and 0
		int result8 = twoNonDecimalNumbersSubtraction.subtract(0,0);
		System.out.println(result8);
	}
}