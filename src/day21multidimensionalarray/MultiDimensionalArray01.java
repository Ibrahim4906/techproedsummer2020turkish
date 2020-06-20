package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		// Bir array icerisinde farkli array'lar var ise buna "MultiDimensionalArray" denir.
		// "MultiDimensionalArray" icerisinde de array'lar var ise buna "  " denir.
		
		// Multi Dimensinol Array Olusturma ( 2 boyutlu olusturma ) 
		
		int arr [][] = new int[3][4]; // Ilk parantez en distaki array'in icerisinde kac
		// array oldugunu, ikinci parantez ise bu array'larin icerisinde kac eleman oldugunu gosterir.							   
					
		System.out.println(Arrays.toString(arr));    // Bu sekilde sadece array'larin adresleri yazdirilir.
		System.out.println(Arrays.deepToString(arr));// Bu method ile tum array'lari yazdirir.
		
		// Deger atama 1. Yontem:
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
	    arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		arr[2][0] = 9;
		arr[2][1] = 10;
		arr[2][2] = 11;
		arr[2][3] = 12;
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[1][2]);// 7 return eder.
		System.out.println(arr[0][3] + arr[2][1]);// 4 + 10 = 14 return eder.
	}

}
