package Day6_Overloads;

public class Static 
{
  static int x;
   static int y;
  static String s;
   void sum(int a,int b,String z)
  {
    	x=a;
    	y=b;
    	s=z;
  }
  static void Display()
  {
	System.out.println(x+ " "+y);
	System.out.println(s);
  }
  public static void main(String[] args)
  { 
	  x=121;
	  y=200;
	  s="Reshma";
			  
	  Display();
	  Static st=new Static();
	  st.sum(22, 33, "Sri");
	  st.Display();
}
  
}
