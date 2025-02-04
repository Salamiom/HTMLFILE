import java.util.Scanner;
class Pattern77 
{
public static void main(String args[])
{
int i , num , j ;
Scanner scan  = new Scanner(System.in);

System.out.print("enter any number");
num = scan.nextInt();
for(i=1 ; i<=num ; i++)
{
for(j=1 ; j<=num ; j++)
{
	if(i==1|| j==1 || i ==num || j==num || j==num-i+1)
	{
System.out.print("*"+ "  ");
}
else
{
	System.out.print("  ");
}}
System.out.println();
}}}