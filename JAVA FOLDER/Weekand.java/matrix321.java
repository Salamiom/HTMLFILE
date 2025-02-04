import java.util.Scanner;
class matrix321
{
public static void main(String args[])
{
int mat1[][] = new int[10][10] ,i , j , row , col;
int mat2[][] = new int[10][10] ;
int mat3[][] = new int[10][10] ;
Scanner scan  = new Scanner (System.in);

System.out.print("enter no. of row");
row = scan.nextInt();
System.out.print("enter no. of column");
col = scan.nextInt();
for(i=0  ;i<row ; i++)
{
for(j=0 ; j<col ; j++)
{ 
System.out.print("enter row matrix");
mat1[i][j] = scan.nextInt();
}}
for(i=0  ;i<row ; i++)
{
for(j=0 ; j<col ; j++)
{ 
System.out.print("entercolumn matrix");
mat2[i][j] = scan.nextInt();
}}
System.out.print("display 1st matrix");
for(i=0  ;i<row ; i++)
{
for(j=0 ; j<col ; j++)
{ 
System.out.println(mat1[i][j]+   "  ");
}
System.out.println();
}
System.out.print("display 2nd matrix");
for(i=0  ;i<row ; i++)
{
for(j=0 ; j<col ; j++)
{ 
System.out.println(mat1[i][j]+   "  ");
}
System.out.println();
}
for(i=0  ;i<row ; i++)
{
for(j=0 ; j<col ; j++)
{
mat3[i][j] = mat1[i][j] + mat2[i][j];
}}
System.out.print("display add two matrix");
for(i=0  ;i<row ; i++)
{
for(j=0 ; j<col ; j++)
{
System.out.print(mat3[i][j]+  "  ");
}
System.out.println();
}}}










