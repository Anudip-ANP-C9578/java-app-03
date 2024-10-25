package org.anudip.javaapp03.operation;


public class TwoNonDecimalNumbersSubtraction {

        // this methord is to subtract 2 integer values

    public int subtract(int num1, int num2) {
        // Check for negative numbers
        int result = 0;

        if ((num1 < 0) || (num2 < 0)) {
            result = -1;
        }

        // Check for zero values
        else if (num1 == 0 || num2 == 0) {
            result = -2;
        }

        // Perform subtraction and return the result
        else {
        result = num1 - num2;

        }
        return result;
     }
}
