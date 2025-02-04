class employ
int eid;
String empname;
employ(int id, String name)
{
eid =id;
empname = name;
System.out.println(eid+" , " +empname);
}
employ(employ emp)
{
System.out.println("inside copy constructor");

System.out.println(emp.eid+" , " +emp.empname);
public class copyconstdemo
{
public static void main(String args[])
{
employ emp1 = new employ(1, "shivam");
employ emp2 = new employ(emp1);
}