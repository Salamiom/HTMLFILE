import java.io.*;
class AA
{
public static void main(String args[])
{
int a =5;
int b = 0;
try
{
int res = a/b;
}
catch(ArithmeticException e)
{
System.out.println(e);
}}}
