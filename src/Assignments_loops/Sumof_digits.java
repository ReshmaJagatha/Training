package Assignments_loops;

public class Sumof_digits {
public static void main(String[] args) {
	int n=1234,sum=0;
	System.out.println("number before is:"+ n);
	System.out.println();
	while(n>0)
	{
		int rem=n%10;
		sum=sum+rem;
	    n=n/10;
	}
		System.out.println("number after adding all the digits: "+sum);
	

}
}
