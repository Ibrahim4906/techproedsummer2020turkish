package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		// Bolme islemi yapan bir program yaziniz
		int num1 = 12;
		int num2 = 0;
		try {
			System.out.println(num1/num2);
		}
		catch (ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilmaz");
		}catch (Exception e) {
			System.out.println("Her exception'i yakala");
		}
		
		// ArithmeticException Run Time Exception'dir. Matematik kurallarina
		// uygun olmayan bir islem yapildiginda bu exception alinir. 
		// try'dan sonra 1'den fazla catch kullanilabilir. Ama ustteki catch
		// alttaki catch'in child'i olmalidir. 

	}

}
