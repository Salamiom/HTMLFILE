import java.util.Scanner;
class palindrome 
{
public static void  main(String args[])
{
Scanner scan = new Scanner(System.in);
 int num , rem, rev=0 ,i , red,  count=0 ;
 System.out.print("enter the number that you want to check");
 num  = scan.nextInt();
 red= num;
 while(num!=0)
 {
 rem = num%10;
 
 rev = rev*10+rem;
 num = num/10;
 }
 if(rev == red)
 {
	 count++;
 System.out.println("it's a palindrome number");
 
 }
 else
 {
 System.out.println("it's not a palindrome number");
 }
 System.out.println("the total no . is " +count);
 }
 }
 