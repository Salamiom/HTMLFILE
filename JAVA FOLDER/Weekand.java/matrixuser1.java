import java.util.Scanner;
class matrixuser1
{
public static void main(String args[])
{
int mat[][] = new int[10][10] , i ,j, row, col;
Scanner scan  = new Scanner(System.in);
System.out.print("enter row");
row    = scan.nextInt();
System.out.println("enter column");
col = scan.nextInt(); 
for (i=0 ; i<row ; i++)
{
for(j=0 ; j<col ; j++)
{
System.out.println("enter matrix");
mat[i][j] = scan.nextInt();
}}
System.out.println("display matrix");
for (i=0 ; i<row ; i++)
{
for(j=0 ; j<col ; j++)
{
	if(i==0)
{
System.out.print(mat[i][j]);
}}
System.out.println();
}}

}

