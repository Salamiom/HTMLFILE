class Ternary12
{
	public static void main(String args[])
	{
		int x , y ,z; 
		x = 10; 
		y  = 3;
		z = 30;
		int max = (x>y)  ? (x>z? x:z)  : (y>z ? y:z);
		System.out.println("greater  is" +max);
}}