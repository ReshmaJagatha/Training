package Day6_Overloads;

public class This 
{
  int i;
  int j;
  void add(int i,int j)
  {
	  this.i=i;
	  this.j=j;
  }
  void Display()
  {
	  System.out.println(i);
	  System.out.println(j);
  }
  public static void main(String[] args) 
  {
	This t=new This();
	t.add(23,34);
	t.Display();
  }
 
  
}
