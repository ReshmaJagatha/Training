package Day6_Overloads;

public class static_keyword 
{
  int id;
  String name;
   static String role="automation";
  void set(int id,String name)
  {
	  this.id=id;
	  this.name=name;
	  
  }
  void Display()
  {
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(role);
	  System.out.println();
  }
  public static void main(String[] args) 
  {
	  static_keyword  st=new static_keyword ();
	  st.set(100,"Reshma");
	  st.Display();
	  static_keyword  st1=new static_keyword ();
	  st1.set(101,"sri");
	  st1.Display();
}
}
