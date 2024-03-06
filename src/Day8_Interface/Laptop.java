package Day8_Interface;

public interface Laptop 
{
  int x=110;
  void cut();
  default void copy()
  {
	  System.out.println("this is default method from interface laptop");
  }
  static void paste()
  {
	  System.out.println("this is static method from interface laptop");
  }
}
