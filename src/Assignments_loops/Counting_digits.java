package Assignments_loops;

public class Counting_digits {
public static void main(String[] args) {
	int n=423424789,count=0;
	while(n>0)
	{
		int rem=n%10;
		
		n=n/10;
		count++;
	}
	System.out.println("the sum of all the digits are :"+count);
}
}
