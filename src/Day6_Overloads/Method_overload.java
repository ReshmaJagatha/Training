package Day6_Overloads;

public class Method_overload
{
 int a;
 int b;
 String s;
 void sum()
 {
	 a=100;
	 b=200;
 }
 void sum(int x,int y)
 {
	 a=x;
	 b=y;
 }
 void sum(int x,String z)
 {
	 a=x;
	 s=z;
 }
 void sum(String z,int x)
 {
	  s=z;
	  a=x;
	  
 }
 void Display()
 {
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(s);
	 System.out.println();
 }
 public static void main(String[] args)
{
	 Method_overload m=new Method_overload();
	 m.sum();
	 m.Display();
	 Method_overload m1=new Method_overload();
	 m1.sum(10,20);
	 m1.Display();
	 Method_overload m2=new Method_overload();
	 m2.sum(10,"Reshma");
	 m2.Display();
	 Method_overload m3=new Method_overload();
	 m3.sum("Sri",1000);
	 m3.Display();
}
}
