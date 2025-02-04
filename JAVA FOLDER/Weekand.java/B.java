class A
{
	String name = "hello"
void show()
{
System.out.println("this is parent" +name);
}}
class B extends A
{
void show()
{
	super.show();
System.out.println("this is child");
}
public static void main(String args[])
{

B b1 = new B();
b1.show();

}}
