import java.util.Scanner;
class Reverse90
{
public static void main(String args[])
{
int rem , num , rev=0  , other;
Scanner scan = new Scanner(System.in);
System.out.println("enter any number");

num = scan.nextInt();
other = num;
while(num!= 0)
{
rem = num%10;
rev = rev*10+rem;
num = num/10;
}
if(other== rev)
{ 
System.out.println("no is" +rev);
}
System.out.println("reverse is " +rev);
}}
