package Day4_strings;

public class String_split {
public static void main(String[] args)
{
	String s="welcome@to the java";
	 String a[] =s.split("@");
	 //System.out.println(a[0]);//welcome
	 //System.out.println(a[1]);//To the java
	 
	 for(int i=0;i<2;i++)
	 {
		 System.out.println(a[i]);
	 }
}
}
