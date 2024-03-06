package Day7_Inheritance;
class super1
{
	int i=10;
	void show()
	{
		System.out.println("this is parent class");
	}
}
class super2 extends super1
{
	int j=200;
	void show()
	{
		System.out.println("this is child class");
		super.show();
	}
	void print()
	{
		System.out.println(super.i);
	}
}
public class Super_keyword 
{
	public static void main(String[] args)
	{
     super2 s=new super2();
     s.show();//this is child class
     s.print();//10
}
}
