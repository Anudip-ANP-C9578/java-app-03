package org.anudip.javaapp03.operation;//package name 

public class TwoNonDecimalNumbersSubtraction {// class declaration{
	public int subtract(int num1, int num2) {//method defining{
		int result = 0;// initially var result contain value 0
		
		if(num1 <0 || num2 < 0) // if both numbers are zero then output is -1
		{
			result = -1;
	    }
		else if ((num1 == 0) || (num2 == 0))// if either num1 or num2 is zero then output is -2
		{
		    result = -2;
		}
		else // if above condition is false then controls come here and perform subtract operation
		{
			result = num1 - num2 ;
		}
		return result; 
    }

}