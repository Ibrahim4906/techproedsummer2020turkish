package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Multi Dimensinol Array Olusturup deger atama 2. Yontem:
		
		int arr [][] = { {1,2}, {3}, {4,5,6} };// Array icindeki array'larin tasidiklari 
											   // eleman sayilari farkli olabilir. 
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[0][1]+arr[1][0] +arr[2][2]); // 2+3+6= 11 return eder.
		
		// arr arrayindeki tum elemanlarin toplamini veren programi yaziniz.
		
		for ( int i= 0; i<arr.length; i++) {
			
			for (int j=0; j<arr[i].length; j++) {
				
			}
			
		}


	}

}
