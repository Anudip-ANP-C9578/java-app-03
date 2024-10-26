package org.anudip.javaapp03.operation;

public class TwoNonDecimalNumbersSubtraction { /* Defining class */
    public int subtract(int num1, int num2) { /* taking two integers as a parameter */
	    int result=0;
        if ((num1 < 0) || (num2 < 0)) { /* if num1 or num2 is less then zero it will give result as -1 */
            result = -1;
        } else if ((num1 == 0) || (num2 == 0)) { /* if num1 or num2 is equal to zero it will give result as -2 */
            result = -2;
        } else {
             result =  num1 - num2;/* using Subtraction operation */
        }
        return result;/* returns the value of result from the subtract method */
    }
}