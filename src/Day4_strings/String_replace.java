package Day4_strings;

public class String_replace {
public static void main(String[] args)
{
  /* String s="welcome";
   System.out.println(s.replace('w', 'B'));//Belcome
   System.out.println(s.replace('e', 'a').replace('l','j').replace('c', 'j').replace('o', 'i').replace('m','l'));*/

   String s="$12,45,67";
  System.out.println(s.replace("$", "").replace(",", ""));//124567
  System.out.println(s.replace("$12,45,67", "Java"));//java
}
}
