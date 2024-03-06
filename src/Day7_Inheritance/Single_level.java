package Day7_Inheritance;

class A
{
  int i;
  void print()
  {
	  System.out.println(i);
  }
}
  class B extends A
  {
	  int j=101;
	  void Display()
	  {
		  System.out.println(j);
	  }
  }

public class Single_level
{
 public static void main(String[] args)
{
 B b=new B();
 b.i=1000;
 b.print();//100
 b.Display();//101
 
}
}
