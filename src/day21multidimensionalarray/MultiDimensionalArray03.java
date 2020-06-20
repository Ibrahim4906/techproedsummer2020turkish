package day21multidimensionalarray;

public class MultiDimensionalArray03 {

	public static void main(String[] args) {
		// Asagidaki iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
		
		 int arr1[][] = { {1,2}, {3,4,5}, {6} }; 
		 int arr2[][] = { {7,8,9}, {10,11}, {12} };
		 
		 int sum1= 0;// sum1 uzerine gelip refactor ve rename yapilirsa 
		 			 // tum sum1 ler farkli bir isim ile degistirilebilir.
		 for(int i=0; i<arr1.length-1; i++ ) {
			 for ( int j=0; j<arr1[i].length; j++) {
				 sum1 = sum1 + arr1[i][j];
			 }
			 
		 }
		 System.out.println(sum1); // 21 

		int sum2 = 0;
		for ( int i= 0; i<arr2.length; i++) {
			for(int k=0; k<arr2[i].length; k++) {
				sum2 = sum2 + arr2[i][k];
			}
		}
		System.out.println(sum2);// 57
		
		System.out.println("arr1+arr2: " + (sum1+sum2));
	}

}
