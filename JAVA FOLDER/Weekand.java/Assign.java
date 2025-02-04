import java.util.Scanner;
class Assign
{
	public static void main(String args[])
	{
		int a , b;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter 1st no.");
		a = scan.nextInt();
		System.out.print("enter 2nd no.");
		b = scan.nextInt();
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
}}
		
