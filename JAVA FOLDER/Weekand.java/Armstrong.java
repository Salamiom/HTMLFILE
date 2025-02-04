import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner scan= new Scanner(System.in);
int n , r , sum=0  , temp;
System.out.println("enter any number");
n= scan.nextInt();
temp = n;

while(n>0)
{
r= n%10;
n = n/10;
sum = sum + r*r*r;
}
if (temp == sum)
System.out.println("armstrong");
else
System.out.println("no");
}}


