package Assignments_Arrays;

public class Sumofdigits {
public static void main(String[] args) {
	/*int a[]= {2,5,8,6,5,7,1,2};
	System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]);*/
	int a[]= {4,5,7,90,8,7,4};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
	sum=sum+a[i];
	
	}
	System.out.println("sum of digits are: "+ sum);
	
	
}
}
