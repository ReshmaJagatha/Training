package Assignments_loops;

public class Smallest_number {
public static void main(String[] args) {
	int a=20,b=30,c=40;
	if(a<b && a<c && b<c)
	{
		System.out.println("a is smaller number: "+a);
	}
	else if(a>b && b<c)
	{
		System.out.println("b is smaller number: "+b);
	}
	else if(b>c && a>c)
	{
		System.out.println("c is smaller number: "+c);
	}
	else
	{
		System.out.println("Invalid");
	}
}
}
