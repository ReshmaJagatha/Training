package Assignments_loops;

public class Swap {

	public static void main(String[] args) 
	{
 /*	int a=44;
	int b=33;
	int n;
	n=a; //n=44;
	a=b; //a=33;
	b=n; //b=44;
	System.out.println("a value is: "+a);
	System.out.println("b value is: "+b);
 */
    //Swap 2 numbers
	/*	int a=33;
		int b=44;
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		*/
		
		// largest of two numbers using if-else
	/*	int a=33;
		int b=44;
		if(a<b)
		{
			System.out.println("b is largest number");
			
		}
		else
		{
			System.out.println("a is largest number");
		}
		*/
		
		// largest of two numbers using ternary
		
	/*	int a=33;
		int b=44;
		
	    int res=(a<b)? 44 :33;
		System.out.println(res);*/
		
	/*	int a=33;
		int b=44;
		int c=23;
		if(a<c || b>c)
		{
			System.out.println("c is smaller number");
		}
		else if(a>b &&b>c)
		{
			System.out.println("a is smaller number");
		}
		else if(b<a || c>a)
		{
			System.out.println("b is smaller number");
		}
		else
		{
			System.out.println("Invalid number");
		} */
		
	//Reverse number
 /*	int i=4567,sum=0;
	while(i>0) 
	{
      
      int rem=i%10;
      sum=sum*10+rem;
      i=i/10;
	}
	System.out.println(sum);*/
    
	//palindrome number
		
	/*	int i=5665,sum=0,originalnumber;
		while(i>0)//5665>0
		{
			int rem=i%10;
			sum=sum*10+rem;
			i=i/10;
		}
	
		originalnumber=sum;
	  if(originalnumber==sum)
	  {
		  System.out.println("palindrome");
	  }
	  else
	  {
		  System.out.println("not palindrome");
	  }
	*/  
	
	//Count the digits in a number
		
	/*	int i=345678,count=0;
		while(i>0)
		{
			int rem=i%10;
			count=count+1;
			i=i/10;
		}
		System.out.println(count);
	*/
		
	// sum of digits in a number
	/*	int i=987654,sum=0;
		while(i>0)
		{
			int rem=i%10;
			sum=sum+rem;
			i=i/10;
		}
		System.out.println(sum);
		
		*/
	
	// count even and odd digits in number
		int i=234567,counteven=0,countodd=0;
		while(i>0)
		{
			int rem=i%10;
			if(rem%2==0)
			{
				counteven=counteven+1;
				System.out.println("Evencount is:" + counteven);
			}
			else
			{
				countodd=countodd+1;
				System.out.println("Oddcount is:"+countodd);
			}
			i=i/10;
			
		
		}
		
		
		
		
		
	}

}
