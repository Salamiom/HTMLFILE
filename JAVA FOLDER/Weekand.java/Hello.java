import java.util.Scanner;
class hello
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an interger");
		int a = scan.nextInt();
		System.out.println("the  integer is " +a);
		System.out.println("enter an decimal number");
		float f = scan.nextFloat();
		System.out.println("the  decimal number is " +f);
		System.out.println("enter an character ");
		char c = scan.next().charAt(0);
		System.out.println("the  character is " +c);
}}