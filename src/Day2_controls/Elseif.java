package Day2_controls;

public class Elseif {
public static void main(String[] args) {
	/*int i=0;
	if(i>0) {
		System.out.println("the given number is positive");
	}
	else if(i<=0) {
		System.out.println("the given number is negative");
	}
	else {
		System.out.println("the given number is zero");
	}*/
	int a=109,b=255,c=567;
	if(a<b && b<c)
	{
		System.out.println("c is greater number: "+c);//c is greater number:567
	}
	else if(a<b && b>c)
	{
		System.out.println("b is greater number:"+b);
	}
	else {
		System.out.println("a is greater number:"+a);
	}
}
}
