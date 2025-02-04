import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
Scanner scan  =new Scanner(System.in);
 char vowel = scan.next().charAt(0);
 switch (vowel)
 {
 case 'a':
 case'A':
 case 'e':
 case'E':
 case 'i':
 case'I':
 case 'o':
 case'O':
 case 'u':
 case'U':
 System.out.println("it is vowel");
 break;
 default:
 System.out.println("it is consonant");
 }}}     
 
 