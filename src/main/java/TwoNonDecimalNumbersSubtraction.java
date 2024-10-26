package org.anudip.javaapp03.operation;

public class TwoNonDecimalNumbersSubtraction //This class performs subtraction of two non-decimal numbers/
{
	public int subtract(int num1,int num2) //This method performs subtraction of two non-decimal numbers/
	{
		int value;
		if(num1<0||num2<0) //check if either number is less than zero
		{
			value=-1;
		}
		else if(num1==0||num2==0) //check if either number is zero
		{
			value=-2;
		}
		else
		{
			long result=(long)num1-num2; //performs subtraction operation
			//stores result in value//
			value=(int)result;  //Explicit Type casting
	    }
		switch(value)
		{
			case-1:
			  return -1; //return -1 for negative numbers
			case-2:
			  return -2; //return -2 if either number is zero
			default:
			  return value; //return value as result
		}
	}
}