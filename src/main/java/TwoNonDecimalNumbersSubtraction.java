/*Program to perform subtraction of two non-decimal numbers*/

package org.anudip.javaapp03.operation;

public class TwoNonDecimalNumbersSubtraction     

/*To performs the task subtraction of two non-decimal numbers*/

{
	public int subtract(int var_1, int var_2)  
	
	/*This method performs the task of subtraction of two non-decimal numbers.*/

    {      
		// USING SWITCH CASE STATEMENT TO RETURN VALUES

		switch(input_check(var_1,var_2))
		{
			case 0 : return var_1 - var_2; //Subtraction performing

			case -1 : return -1; 

			case -2 : return -2; 

			default : return -1; //fallback 
 		}
	}

	//This method checks input vales

	public int input_check(int var_1,int var_2)	
	{
		// USING IF_CONDITION TO CHECK INPUT VALUES

		if (var_1 < 0 || var_2 < 0) 
		{
			return -1;  //returns -1 for negative input
		}
		if (var_1 == 0 || var_2 == 0)
		{
			return -2;  //returns -2 for input value zero
		}
		return 0;  //returns zero
	}
}