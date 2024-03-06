package Day6_Overloads;

public class Mainmethod 
{
   int a;
   int b;
   void main()
   {
	   a=10;
	   b=11;
	   System.out.println(a+b);
   }
   public  void main(int[] args)
   {
	   a= 7;
	   b=8;
	   
   }
   public static void main(String[] args)
   {
	   Mainmethod m=new Mainmethod();
	   m.main();
}
}
