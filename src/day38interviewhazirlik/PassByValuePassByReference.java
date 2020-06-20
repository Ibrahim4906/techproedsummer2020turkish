package day38interviewhazirlik;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		// Bir methoda variable yollandiginda Java o variable'in kopyasini olusturur ve methoda kopyayi yollar.
		// Bu yuzden variable'in orjinal degeri method calistiktan sonra da ayni kalir.
		// Buna Pass By Value denir.
		// Pass by Reference'da ise reference'in kopyasi olusturulur ve methoda yollanir fakat reference'in
		// kopyasi da kendisi gibi ayni objecti gosterdigi icin orjinal deger degisir. 
		
		int x = 12; 
		System.out.println(increment(x));
		System.out.println(x);

	}
		public static int increment (int a) {
			a = a + 1;
			return a;
		}
}
