package Day7_Inheritance;

class Parent
{
	int i=100;
	void show()
	{
		System.out.println(i);
	}
}
class child1 extends Parent
{
	int j=101;
	void print()
	{
		System.out.println(j);
	}
}
class child2 extends Parent
{
	int k=102;
	void Display()
	{
		System.out.println(k);
	}
}
public class Hierarichy
{
public static void main(String[] args) 
{
  child2 c=new child2();	
  c.show();//100
  c.Display();//102
  
  child1 c1=new child1();
  c1.print();
}
}
