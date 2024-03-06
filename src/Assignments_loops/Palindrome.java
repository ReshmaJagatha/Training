package Assignments_loops;

public class Palindrome {
public static void main(String[] args) {
	int n=5658,sum=0;
	int originalnumber=n;
	while(n>0)
	{
		int rem=n%10;
		sum=sum*10+rem;
		n=n/10;
	}
	System.out.println("the reverse number is :"+sum);
	if(originalnumber==sum)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
