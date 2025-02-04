import java.util.Scanner;
class Monthswitch
{
public static void main(String args[])
{
Scanner scan  = new Scanner(System.in);
System.out.println("enter month number");
int month  = scan.nextInt();
switch(month)
{
case 1:
System.out.println("january");
break;
case 2:
System.out.println("feb");
break;
case 3:
System.out.println("march");
break;
case 4:
System.out.println("april");
break;
case 5:
System.out.println("may");
break;
case 6:
System.out.println("june");
break;
default:
System.out.println("invalid");}
}}