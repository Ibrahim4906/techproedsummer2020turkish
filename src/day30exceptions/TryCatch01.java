package day30exceptions;

public class TryCatch01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 0;
		
		try {
			System.out.println(num1/num2);
		}catch (ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilamaz");
			// istedigimiz kadar catch kullanabiliriz. Ancak yukarida olan child
			// asagida olan parent olmali.
			
		}finally {// finally{} block exception olsa da olmasa da her zaman calisir.
				  // finally{} block try-catch den sonra ve her zaman calisir.
			System.out.println("Aferin sana");
			
			/* Interview sorusu. final , finally , finalize keyword'lerinin farki nedir?
			 * 1)finally {} ==> try-catch block 'dan sonra kullanilir. 
			 * Exception olsa da olmasa da calisir.
			 * 2)final==> Variable'larda final kullanilirsa , o variable'in degeri
			 * degistirilemez.Mesela pi sayisi final yapildigi zaman degeri degistirilemez
			 * final String code = "POS";
			 *       ==> Methodlarda final kullanilirsa , method body'leri degistirilemez,
			 *       dolayisi ile overriding yapilamaz.
			 *       Class'larda final kullanilirsa , o class extend edilemez. 
			 *       public final class Animal{} ==> public class Dog extends Animal
			 *       java yukaridaki yazilima musaade etmez. Cunku final ile class
			 *       kisirlastirilir. Ondan child olusturulamaz.
			 * 3)finalize () ==> Bu method , Garbage Collector'in imha edecegi datalari 
			 * imha edilecek hale getirir.
			*/ 
		}
	}

}
