package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		// for loop kullanarak elemanlari ekrana yazdirin.
		int arr[] = {12, 21, 13, 43};
		
		for ( int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		//for each loop kullanarak elemanlari ekrana yazdirin.
		for(int w: arr) {
			System.out.print(w + " ");
		}
		
		// String iceren bir array olusturun ve elemanlarini yanyana aralarina bosluk
		// koyarak for each loop ile ekrana yazdirin.
		
		String arr1[] = { "Ali", "Can", "okula", "basladi"};
		for(String w: arr1) {
			System.out.print(w + " ");
		}
		
		// Integer elemanlar iceren bir List olusturun ve for each loop kullanarak 
		// bu elemanlarin toplamini ekrana yazdirin.
		
		List<Integer> arr2 = new ArrayList<>();
		
		arr2.add(25);
		arr2.add(20);
		arr2.add(15);
		
		int sum = 0;
		for ( int w: arr2) {
			sum = sum + w;
		}
		System.out.println(sum);
		// {{1,2},{5},{6,7,8}} array'indeki tum elemanlarin toplamini return ediniz.
		int arr3[][] = {{1,2},{5},{6,7,8}};
		
		int sum1= 0;
		for ( int[] w: arr3) {
			for ( int z: w)
				
			sum1 = sum1 + z;
		}
		System.out.println(sum1 + " ");
		
	}

}
