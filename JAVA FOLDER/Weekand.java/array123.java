import java.util.Scanner;
class array123
{
public static void main(String args[])
{
int arr[] = new int[100] , j , size;
Scanner scan =  new Scanner(System.in);

System.out.println("enter array size");
size = scan.nextInt();
for(j=0 ; j<size ; j++)
{
System.out.println("enter array element");
arr[j] = scan.nextInt();
}
for(j=0 ; j<size ; j++)
{
System.out.println(arr[j]+"  ");
}
}}