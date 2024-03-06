package Day7_Inheritance;

/*class Bank
{
	int i=300;
	void Display()
	{
		System.out.println(i+50);
	}
	void Display1()
	{
		System.out.println(i);
	}
}
class Build extends Bank
{
	int j=400;
	void Display()
	{
		System.out.println(j*j);
	}
}
class Cashier extends Build
{
	int k=500;
	void Display()
	{
		System.out.println(k+k);
	}
}
public class Method_overriding 
{
	public static void main(String[] args) {
		Build b=new Build();
		b.Display();
        b.Display();//1600
        b.Display1();//300
}
}*/
class Bank
{
	double roi()
	{
		return 10.54;
	}
}
class ICICI extends Bank
{
	double roi()
	{
		return 19.67;
	}
	void print()
	{
		System.out.println(super.roi());
	}
}
class SBI extends Bank
{
	double roi()
	{
	return 28.70;
	}
}
public class Method_overriding
{
	public static void main(String[] args) 
	{
	   ICICI i=new ICICI();
	   System.out.println(i.roi());//19.67
	   i.print();//10.54
	   SBI s=new SBI();
	   System.out.println(s.roi());//28.70
	}
}



















