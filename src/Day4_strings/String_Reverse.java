package Day4_strings;

public class String_Reverse {
public static void main(String[] args)
{
	String s="welcome";
	String rev="";//
	for(int i=s.length()-1;i>=0;i--)
	{
	 rev=rev+s.charAt(i);
	}
	System.out.println(rev);//emoclew
}
}