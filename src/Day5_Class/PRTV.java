package Day5_Class;

public class PRTV
{
 String Display(String name)
 {
	 return "Hello World!" +" "+name;
 }
 public static void main(String[] args)
{
   PRTV p=new PRTV();
    String s =p.Display("Learn something to achieve something");
    System.out.println(s);
}
}
