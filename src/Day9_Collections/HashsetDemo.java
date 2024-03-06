package Day9_Collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo
{
  public static void main(String[] args)
{
	  Set hs=new HashSet();
	// HashSet hs=new HashSet();
	  hs.add(100);
	  hs.add(true);
	  hs.add("Reshma");
	  hs.add("Jagatha");
	  hs.add('x');
	  hs.add(null);
	  
	  System.out.println(hs);
	  hs.remove("Jagatha");
	  System.out.println(hs);
	  System.out.println(hs.size());
	  System.out.println(hs);
	  for(Object x:hs)
	  {
		  System.out.println(x);
	  }
}
}
