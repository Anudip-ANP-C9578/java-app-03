package org.anudip.javaapp03.operation;

public class TwoNonDecimalNumbersSubtraction
{
public int subtract(int num1,int num2)
{
int result=0;

if((num1 < 0)||(num2 < 0))
{
result=-1;
}
else if((num1 == 0) || (num2==0))
{
result=-2;
}
else
{
return num1-num2;
}
return result;
}
}