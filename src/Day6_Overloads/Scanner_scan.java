package Day6_Overloads;

import java.util.Scanner;

public class Scanner_scan
{
   public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a name");
     String s=sc.nextLine();
     
     System.out.println(s);
     
     System.out.println("Enter two numbers");
     int i=sc.nextInt();
     int j=sc.nextInt();
     System.out.println(i+j);
     
}
}
