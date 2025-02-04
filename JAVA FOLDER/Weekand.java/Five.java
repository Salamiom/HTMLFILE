import java.util.Scanner;
class Five
{
	public static void main(String args[])
	{
		int a,b,c,d,e;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number");
		a = scan.nextInt();
		System.out.println("enter 2nd number");
		b = scan.nextInt();
		System.out.println("enter 3rd number");
		c = scan.nextInt();
		System.out.println("enter 4th number");
		d = scan.nextInt();
		System.out.println("enter 5th number");
		e = scan.nextInt();
		if(a>b &&a>c &&a>d && a>e)
		{
			System.out.println("a is greater");
		}
		else if(b>a &&b>c &&b>d && b>e)
		{
			System.out.println("b is greater");
		}
		else if(c>b &&c>a &&c>d && c>e)
		{
			System.out.println("c is greater");
		}
		else if(d>b &&d>c &&d>a && d>e)
		{
			System.out.println("d is greater");
		}
		else if(e>b &&e>c &&e>d && e>a)
		{
			System.out.println("e is greater");
		}
		else
		{
			System.out.println("all are equal");
		}
}}