import java.util.Scanner;
class Double
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.in.println("enter first no.");
       double d1 = scan.nextDouble();
       System.in.println("enter second no.");
       double d2 = scan.nextDouble();
double res = d1-d2;
System.out.println("the 1st no. is " +d1);
System.out.println("the 2nd no. is " +d2);
System.out.println("the subtraction is " +res);
}}
   