import java.util.Scanner;
class even12
{
public static void main(String args[])
{ 
int n, i;
Scanner scan = new Scanner(System.in);
System.out.println("enter any number");
n = scan.nextInt();
System.out.println("the even number is ");
for(i=1 ; i<=n ; i++)
{
if(i%2==0)

System.out.println(i);
}
System.out.println("the odd number is ");
for(i=1 ; i<=n ; i++)
{
if(i%2!=0)

System.out.println(i);
}
}}

