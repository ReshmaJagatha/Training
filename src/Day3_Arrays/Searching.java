package Day3_Arrays;

public class Searching {
public static void main(String[] args) {
	int a[]= {23,45,80,70,55};
	int ele=88;
	for(int i=0;i<5;i++)
	{
		if(ele==a[i])
		{
			System.out.println("element found: "+ele);
		}
		else
		{
			System.out.println("element not found: "+ele);
		}
		
	}
}
}
