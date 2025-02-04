import java.util.Scanner;
class Substract
{
public static void main(String args[])
{
int mat1 = new int[10][10], i , j , row , col;
int mat2 = new int[10][10];
int mat3 = new int[10][10];
Scanner scan = new Scanner(System.in);
System.out.print("enter row");
row = scan.nextInt();
System.out.print("enter column");
col = scan.nextInt();
for (i=0 ; i<row ; i++)
{
for (j=0 ; j<col ; j++)
{
System.out.print("enter 1st matrix");
mat1[i][j]= scan.nextInt();
for (i=0 ; i<row ; i++)
{
for (j=0 ; j<col ; j++)
{
System.out.print("enter 2nd matrix");
mat2[i][j]= scan.nextInt();
}}
System.out.print("display 1st matrix");
for (i=0 ; i<row ; i++)
{
for (j=0 ; j<col ; j++)
{
System.out.print(mat1[i][j]);
}
System.out.println();
}
System.out.println("display 2nd matrix");
for (i=0 ; i<row ; i++)
{
for (j=0 ; j<col ; j++)
{
System.out.print(mat1[i][j]);
}
System.out.println();
}
for (i=0 ; i<row ; i++)
{
for (j=0 ; j<col ; j++)
{mat3[i][j] = mat1 [i][j]- mat2[i][j];

}}

System.out.println("display sub of 2  matrix");
for (i=0 ; i<row ; i++)
{
for (j=0 ; j<col ; j++)
{
System.out.print(mat3[i][j]);
System.out.println();
}}}


