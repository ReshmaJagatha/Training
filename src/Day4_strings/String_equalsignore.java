package Day4_strings;

public class String_equalsignore {
public static void main(String[] args) 
{
 String s1="welcome";
 String s2="Welcome";
 String s3="WelYou";
 /* System.out.println(s1.equals(s2));//false
 System.out.println(s1.equalsIgnoreCase(s2));//true
 System.out.println(s2.equalsIgnoreCase(s3));//false*/
 System.out.println(s2.replace('W', 'w').equals(s1));//true
}
}
