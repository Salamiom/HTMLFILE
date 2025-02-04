import java.util.Scanner;
class loop77
{
public static void main(String args[])
{
	Scanner scan  = new Scanner(System.in);
int i , j , num;
System.out.print("enter number");
num = scan.nextInt();
for(i=1 ; i<=num ; i++)
{
for(j=1 ; j<=num ; j++)
{
if (i==1|| i==num || j==1 || j ==num || i==j || j ==num-i+1)
	
{
System.out.print("*" +"  ");
}
else
{
System.out.print("   ");
}
}
System.out.println();
}}}