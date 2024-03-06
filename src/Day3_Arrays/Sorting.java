package Day3_Arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int r[]= {23,45,10,789,56,45};
		System.out.println("Numbers before sorting:" + Arrays.toString(r));
		Arrays.sort(r);
		System.out.println("Numbers after sorting:"+Arrays.toString(r));

	}

}
