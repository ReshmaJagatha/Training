package Day9_Collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo
{
public static void main(String[] args)
{
 ArrayList ar=new ArrayList();
 // List li= new ArrayList();
 ar.add(100);
 ar.add("Reshma");
 ar.add(true);
 ar.add(34.56);
 ar.add('A');
 ar.add(null);
 ar.add(null);
 ar.add(true);
 System.out.println(ar);
 ar.add(4,"Jagatha");
 System.out.println(ar);
 ar.remove(5);
 System.out.println(ar);
 //ar.size();
 System.out.println(ar.size());
 System.out.println(ar.get(7));
 
 for(Object x:ar)
 {
	 System.out.println(x);
 }
}
}
