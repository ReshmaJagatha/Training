package Day2_controls;

public class Switch {
public static void main(String[] args) {
	/*String s="Indigo";
	switch(s)
	{
	case Indigo:System.out.println("color is indigo");
		        break;
	}*/
	char color='E';
	switch(color)
	{
	case 'A':System.out.println("Indigo");
	       break;
	
	case 'B':System.out.println("Red");
	       break;

	case 'C':System.out.println("Yellow");
	       break;

	case 'D':System.out.println("Green");
	       break;

	case 'E':System.out.println("Orange");
	       break;

	case 'F':System.out.println("Black");
	       break;
	default:System.out.println("Invalid color");
	        break;
	       
	}
}
}
