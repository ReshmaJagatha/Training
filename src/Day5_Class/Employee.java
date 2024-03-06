package Day5_Class;

public class Employee
{
  int i;
  String s;
  char a;
  void Display()
  {
	  System.out.println(i);
	  System.out.println(s);
	  System.out.println(a);
	  System.out.println();
  }
  public static void main(String[] args)
  {
	 Employee emp =new Employee();
	 emp.i=10;
	 emp.s="Reshma";
	 emp.a='A';
	 emp.Display();
	 
      Employee emp1  =new Employee();
      emp1.i=20;
      emp1.s="Ashu";
      emp1.a='A';
      emp1.Display();
      
      Employee emp2=new Employee();
      emp2.i=30;
      emp2.s="Sri";
      emp2.a='A';
      emp2.Display();
	
}
}
