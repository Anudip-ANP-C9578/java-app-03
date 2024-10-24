/*
*creating a package
*/
package org.anudip;

/* 
*importing package and class
*/
import org.anudip.javaapp03.operation.TwoNonDecimalNumbersSubtraction;

public class App {
	public static void main(String[] args) {
		
	   /*
       *creating object
       */	 
	   TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(10,2)); //output:8
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(2,10)); //output:-8
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(10,-2)); //output:-1
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(-10,2)); //output:-1
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(-10,-2)); //output:-1
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(10,0)); //output:-2
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(0,2)); //output:-2
	   
	   System.out.println(twoNonDecimalNumbersSubtraction.subtract(0,0)); //output:-2
	}
}