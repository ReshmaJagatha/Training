package Day9_Collections;

import java.util.Scanner;

public class ExceptionHandleDemo 
{
public static void main(String[] args) 
{
 System.out.println("Program started");
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 try
 {
	 System.out.println(100/num);
 }
 catch(Exception e)
 {
	 System.out.println(e.getMessage());
 }
 System.out.println("Enter string");
 String s=sc.next();
 try 
 {
  int n=Integer.parseInt(s); 
  System.out.println(n);
 }
 catch(Exception e)
 {
	 
 }
 finally
 {
	 System.out.println("this is finally block");
 }
 System.out.println("Program finished");
}
}
