import java.util.Scanner;
class Countandsum
{
public static void main(String args[])
{ 
int i, num , evencount =0 , oddcount = 0 ,  evensum = 0 , oddsum = 0;
Scanner scan  = new Scanner(System.in);
System.out.println("enter any number");
num = scan.nextInt();
System.out.println("the even number :" );

for(i=1 ;i<=num ; i++)
{
if (i%2==0)
	
evencount++ ; 
System.out.println(i);

}
System.out.println("the odd number :" );
for(i=1 ;i<=num ; i++)
{
if (i%2!=0)


oddsum= oddsum+i;
oddcount++ ;
System.out.println(i);	
}
System.out.println("the even sum  :" +evensum );
System.out.println("the odd sum :" +oddsum);
System.out.println("the odd count :"+oddcount );
System.out.println("the even count :"+evencount );
}}


