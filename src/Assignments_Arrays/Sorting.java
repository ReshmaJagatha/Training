package Assignments_Arrays;

import java.util.Arrays;

public class Sorting {
public static void main(String[] args) {
/*	int a[]=new int[8];*/
	int a[]= {56,3,78,786,23,42,};
	
	System.out.println("numbers before sorting is :"+ Arrays.toString(a));
	Arrays.sort(a);
	System.out.println("numbers after sorting is :"+ Arrays.toString(a));
	
}
}
