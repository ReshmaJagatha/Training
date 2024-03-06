package Assignments_loops;

public class Reverse_Number {
public static void main(String[] args) {
	int n=56789,sum=0;
	System.out.println("number before reverse is :"+n);
	while(n>0)
	{
		int rem=n%10;
		sum=sum*10+rem;
		n=n/10;
	}
	System.out.println("number after reverse is: "+ sum);
	
	
}
}
