package Day2_controls;

public class Nestedif {
public static void main(String[] args) {
	if(false)
	{
		if(true)
		{
			System.out.println("print true");//print true
		}
		else {
			System.out.println("print false");
		}
	}
	else
	{
		System.out.println("print false");//print false
	}
}
}
