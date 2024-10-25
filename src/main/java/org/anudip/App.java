package org.anudip;

import org.anudip.javaapp03.operation.TwoNonDecimalNumbersSubtraction;

public class App
{
public static void main(String[] args)
{
TwoNonDecimalNumbersSubtraction twonondecimalnumberssubtraction = new TwoNonDecimalNumbersSubtraction();

long result1 = twonondecimalnumberssubtraction.subtract(10,2);
System.out.println(result1);

long result2 = twonondecimalnumberssubtraction.subtract(2,10);
System.out.println(result2);

long result3 = twonondecimalnumberssubtraction.subtract(10,-2);
System.out.println(result3);

long result4 = twonondecimalnumberssubtraction.subtract(-10,2);
System.out.println(result4);

long result5 = twonondecimalnumberssubtraction.subtract(-10,-2);
System.out.println(result5);

long result6 = twonondecimalnumberssubtraction.subtract(10,0);
System.out.println(result6);

long result7 = twonondecimalnumberssubtraction.subtract(0,2);
System.out.println(result7);

long result8 = twonondecimalnumberssubtraction.subtract(0,0);
System.out.println(result8);
}
}