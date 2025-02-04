import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
int i , j , num;
Scanner scan = new Scanner(System.in);
System.out.print("enter any number");
num = scan.nextInt();
for(i=num ; i>=1 ; i--)
{
for(j=5; j>=i ; j--)
{
System.out.print(i+ "  ");
}
System.out.println();
}
}
}