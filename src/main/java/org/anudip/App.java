package org.anudip;

import org.anudip.javaapp03.operation.TwoNonDecimalNumbersSubtraction ;

public class App 
{
	public static void main(String[] args) 
	{
    TwoNonDecimalNumbersSubtraction twoNonDecimalNumbersSubtraction = new TwoNonDecimalNumbersSubtraction();
 
int value1=twoNonDecimalNumbersSubtraction.subtract(10,2);
System.out.println(value1);
	
int value2=twoNonDecimalNumbersSubtraction.subtract(2,10);
System.out.println(value2);

int value3=twoNonDecimalNumbersSubtraction.subtract(10,-2);
System.out.println(value3);

int value4=twoNonDecimalNumbersSubtraction.subtract(-10,2);
System.out.println(value4);

int value5=twoNonDecimalNumbersSubtraction.subtract(-10,-2);
System.out.println(value5);

int value6=twoNonDecimalNumbersSubtraction.subtract(10,0);
System.out.println(value6);

int value7=twoNonDecimalNumbersSubtraction.subtract(0,2);
System.out.println(value7);

int value8=twoNonDecimalNumbersSubtraction.subtract(0,0);
System.out.println(value8);
		
   }
}