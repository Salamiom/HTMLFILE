class method
{
int add(int a , int b)
{
return a+b ; 

void sub()
{
int a,b;
a = 23; 
b= 24;
int res =  a-b;
System.out.println(res);
}
int div()
{
int a, b;
a= 23;
b = 21;
return a/b;
}
public static void main(String args[])
{
method m = new method();
int res =  m.add(2,3);System.out.println(res);
m.sub();
m.mul(3,4);
int res = m.div(2,3);
System.out.println(res);
}