import java.util.Scanner;
class Result 
{
	public static void main(String args[])
	{
		int a  ;
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter your percentage");
		a = scan.nextInt();
		if (a>=90)
		{
			System.out.println("you are topper");
		}
		else if(a<=90 && a>=80)
		{
			System.out.println("you are average student");
		}
		else if(a<=80 && a>=70)
		{
			System.out.println("you are below average student");
		}
			else if(a<=70 && a>=60)
			{
				System.out.println("you are not a  student");
			}
		else
			System.out.println("invalid option");
}}
		
		
		