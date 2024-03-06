package Day5_Class;

public class Constructor_pm 
{
  int i;
  String s;
  char a;
  Constructor_pm(int ci,String cs,char ca)
  {
	  i=ci;
	  s=cs;
	  a=ca;
  }
  void Display()
  {
	  System.out.println(i+" "+s+" "+a+" ");
	  
	  
  }
  public static void main(String[] args) 
  {
	  Constructor_pm c=new Constructor_pm(100,"Reshma",'A');
	  c.Display();
	  Constructor_pm c1=new Constructor_pm(101,"Sri",'A');
	  c1.Display();
	  Constructor_pm c2=new Constructor_pm(102,"Ashu",'A');
	  c2.Display();
    	  
  }
 }
