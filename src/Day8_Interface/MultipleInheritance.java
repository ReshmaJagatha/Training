package Day8_Interface;

public class MultipleInheritance extends Interface_Demo implements Interface_I2 
{
public static void main(String[] args)
{
	MultipleInheritance m=new MultipleInheritance();
	m.method1();
	m.method2();
	System.out.println(x);
	System.out.println(i);
	System.out.println(y);
}


public void method1()
{
	System.out.println(i+i);
}


public void method2()
{
	System.out.println(y+y);
	
}
}
