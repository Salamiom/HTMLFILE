class Reverse 
{
	public static void main(String args[])
	{
		int num = 2345, rev =0, rem=1;
		while(num!=0)
		{
		rem = num%10;
		rev = rev *10+rem;
		num=num/10;
		}
		System.out.println("the reverse no is " +rev);
		
}}