package Day3_Arrays;

import java.util.Arrays;

public class Array_2D {
public static void main(String[] args) {
	/*int a[][]=new int[3][2];
	a[0][0]=10;
	a[0][1]=20;
	a[1][0]=30;
	a[1][1]=40;
	a[2][0]=50;
	a[2][1]=60;
	System.out.println(a.length);
	System.out.println(a[1].length);
	for(int r=0;r<=2;r++)
	{
		for(int c=0;c<2;c++)
		{
			System.out.print(a[r][c]+" ");
		}
		System.out.println();
	}*/
/*	int a[][]= {{10,20},{30,40},{50,60},{70,80}};
	System.out.println(a[2][0]);//50
	System.out.println();
	for(int r=0;r<3;r++)
	{
		for(int c=0;c<2;c++)
		{
			System.out.print(a[r][c]+" ");
		}
		System.out.println();
	} */
	int a[][]= {{35,67},{33,44},{55,66},{77,88}};
  for(int r[]:a)
  {
	  for(int c:r)
	  {
		  System.out.print(c+" ");
	  }
	  System.out.println();
  }
}
}
