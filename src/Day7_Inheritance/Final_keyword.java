package Day7_Inheritance;

 class parent
  {
	 final int i=100;
	final void show()
	  {
		  System.out.println(i);
	  }
  }
class child extends parent
{
	int j=34;
	void show1()
	{
		System.out.println(j);
	}
}
  public class Final_keyword
  {
	  public static void main(String[] args)
  {
	 
	  child c=new child();
      c.show();//100
      
  }
}