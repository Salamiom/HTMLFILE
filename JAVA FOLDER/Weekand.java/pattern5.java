import java.util.Scanner;
class pattern5 
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
System.out.print("*"+ "  ");
}
System.out.print();
}}}