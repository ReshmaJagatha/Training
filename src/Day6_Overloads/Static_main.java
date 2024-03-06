package Day6_Overloads;

public class Static_main 
{
	static int a;
	static String s;
void add(int i,String s)
{
	a=i;
	this.s=s;
}
 static void Display()
{
	System.out.println(a);
	System.out.println(s);
}

}
