package Assignments_loops;

public class Count_even_odd_digits {

	public static void main(String[] args) {
	int n=23456,counteven=0,countodd=0;
	while(n>0)
	{
		int rem=n%10;
		
		if(rem%2==0)
		{
			
			counteven++;
			
			System.out.println("even is:"+counteven);
		}
		else
		{
			countodd++;
			System.out.println("odd is:"+countodd);
		}
		n=n/10;
		
		
	}
	

	}

}
