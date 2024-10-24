/*
*creating a package
*/
package org.anudip.javaapp03.operation;

/*
*creating a class named TwoNonDecimalNumbersSubtraction
*/
public class TwoNonDecimalNumbersSubtraction {

/*
*creating a method named subtract accessible to any class
*and  this method contains two parameters 
*of int type and returns result of int type 
*/
    public int subtract(int num1, int num2) {
		int result = 0;
		
		/*checking if number is negative and 
		*if negative return -1
		*/
		if (num1 < 0 || num2 < 0) {
			return -1;
		} 
		
		/*checking if number is 0 and 
		*if 0 return -2
		*/
		else if(num1 == 0 || num2 == 0) {
			return -2;
		} 
		
		//performs subtraction if number is neither negative nor 0
		else {
            result = num1 - num2;
        }
        return result;
    }
}	