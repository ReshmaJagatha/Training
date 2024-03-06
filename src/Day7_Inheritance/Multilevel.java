package Day7_Inheritance;

/*class level
{
   int i=1;
   void show()
   {
	System.out.println(i);
   }
}

class level1 extends level
{
	int j=2;
   void Display()
   {
	   System.out.println(j*j);
   }
}

class C extends level1
{
	int k=3;
	void print()
	{
		System.out.println(k+k);
	}
	
}
public class Multilevel
{
  public static void main(String[] args)
  {
	  C c=new C();
	  c.show();//1
	  c.Display();//2
	  c.print();//3
}
}*/
class cat
{
	
	String color="white",nature="soft";
	void Display()
	{
		System.out.println(color+" "+"and "+" "+nature);
	}
}
class hen extends cat
{
	float f=300.40f;
	String taste="good",nature="soft";
	void Display1()
	{
		System.out.println("cost of hen is: "+ f);
		System.out.println(taste+" "+"and"+" "+nature);
	}
}
class peacock extends hen
{
	String nature="beautiful",origin="feathers";
	void Display2()
	{
		
		System.out.println(nature+" "+"and has many"+" "+origin);
	}
}
public class Multilevel
{
	public static void main(String[] args)
	{
	 peacock p=new peacock();
	 p.Display();//white and soft
	 p.Display1();//good and soft
	 p.Display2();//beauty feathers
	 
	}
}



















