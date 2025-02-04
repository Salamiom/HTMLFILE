import java.util.Scanner;
class matrix
{ 
public static void main(String args[])
{
int mat[][] = new int[2][2] , i , j ;
Scanner scan= new Scanner(System.in);
mat[i][j] = scan.nextInt();

for(i=0 ; i<2 ; i++)
{
for(j = 0 ; j<2 ; j++)
{
	System.out.print("enter matrix");

}

}
System.out.print("display matrix");
for(i=0 ; i<2 ; i++)
{
for(j = 0 ; j<2 ; j++)
{
System.out.print(mat[i][j]);
}
System.out.println();
}}}