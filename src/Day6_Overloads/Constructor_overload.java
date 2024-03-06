package Day6_Overloads;

public class Constructor_overload
{
 int a;
 int b;
 String s;
 Constructor_overload()
 {
  a=100;
  b=200;
  s="Reshma";
 }
 Constructor_overload(int a,int b)
 {
   this.a=a;
   this.b=b;
}
 Constructor_overload(int x,String c)
 {
	  a=x;
	  s=c;
 }
 Constructor_overload(String d,int i)
 {
	 s=d;
	 a=i;
	  
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
	 Constructor_overload c=new Constructor_overload();
	 c.Display();
	 Constructor_overload c1=new Constructor_overload(40,41);
	 c1.Display();
	 Constructor_overload c2=new Constructor_overload(50,"Reshma");
	 c2.Display();
	 Constructor_overload c3=new Constructor_overload("Ashu",45);
	 c3.Display();
}
 
}


