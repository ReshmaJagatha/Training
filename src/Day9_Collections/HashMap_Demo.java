package Day9_Collections;

import java.util.HashMap;

public class HashMap_Demo 
{
public static void main(String[] args)
{
    //HashMap hm=new HashMap();
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(101,"Manager");
    hm.put(102,"Customer");
    hm.put(103, "Tester");
    hm.put(104, "Marketing");
    hm.put(105, "HR");
    System.out.println(hm);
    System.out.println(hm.size());
    System.out.println(hm.get(105));
    System.out.println(hm);
    hm.remove(105);
    System.out.println(hm);
    System.out.println(hm.keySet());
    System.out.println(hm.values());
   //hm.clear();
   System.out.println(hm);
   for(String z:hm.values())
   {
	   System.out.println(z);
   }
    
}
}
