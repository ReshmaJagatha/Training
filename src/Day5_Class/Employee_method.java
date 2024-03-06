package Day5_Class;

public class Employee_method
{
   int i;
   String s;
   char a;
   void setData(int ei,String es,char ea)
   {
	   i=ei;
	   s=es;
	   a=ea;
   }
   void Display()
   {
	   System.out.println(i);
	   System.out.println(s);
	   System.out.println(a);
	   System.out.println();
   }
   public static void main(String[] args) {
	   Employee_method emp=new Employee_method();
	   emp.setData(10, "Reshma", 'A');
	   emp.Display();
	   Employee_method emp1=new Employee_method();
	   emp1.setData(11, "Ashu", 'A');
	   emp1.Display();
	   Employee_method emp2=new Employee_method();
	   emp2.setData(12, "Sri", 'A');
	   emp2.Display();
}
}
