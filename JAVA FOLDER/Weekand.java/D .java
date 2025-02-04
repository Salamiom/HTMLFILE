class C
{
  C()
  {
  System.out.println("default");
  }
  }
  class D extends C
  {
    D()
  {
  super();
  System.out.println("next");
  }
  public static void main(String args[])
  {
  B b1 = new B();
  }}
  