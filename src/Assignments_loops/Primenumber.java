package Assignments_loops;

public class Primenumber {

	public static void main(String[] args) 
	{
	int n=13,count=0;
	for(int i=1;i<=15;i++)
	{
		if(n%i==0)
		{
			count=count+1;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

	}

}
