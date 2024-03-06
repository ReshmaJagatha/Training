package Day4_strings;

public class String_immutable {
public static void main(String[] args)
{
  String s="welcome ";
  s.concat("to java");
  System.out.println(s);//welcome
  String s1="welcome ";
  String s2="to java";
  System.out.println(s1+s2);//welcome to java
  StringBuilder sb=new StringBuilder("Hello ");
  sb.append("my dear honours");
  System.out.println(sb);//Hello my dear honours
  
  StringBuffer bf=new StringBuffer("Hii I am ");
  System.out.println(bf.append(" an Indian"));//Hii I am Indian
}
}
