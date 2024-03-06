package Day4_strings;

public class String_comparison 
{
 public static void main(String[] args)
{
   String s1="welcome";
   String s2="welcome";
   System.out.println(s1==s2);//true
   System.out.println(s1.equals(s2));//true
   
   String s3="welcome";
   String s4=new String("welcome");
   System.out.println(s3==s4);//false
   System.out.println(s3.equals(s4));//true
   
   String s5=new String("welcome");
   String s6=new String("welcome");
   System.out.println(s5=s6);//false
   System.out.println(s5.equals(s6));//true
}
}
