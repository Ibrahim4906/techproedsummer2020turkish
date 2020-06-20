package javapracticeday6;

public class StaticVariable {

	static int num1 = 15;
	int num2 = 15;
	
	public static void main(String[] args) {
		// Iki tane instance int variable olusturunuz ve biri static digeri 
		// non-static olsun sonra bu class tan iki farkli object olusturunuz
		// Her objectle instance variable lara rakam ekleyiniz
		StaticVariable obj1 = new StaticVariable();
		
		
		obj1.num1 += 15;
		obj1.num2 += 15;
		
		System.out.println(obj1.num1);// 30 return eder
		System.out.println(obj1.num2);// 30 return eder
		
		StaticVariable obj2 = new StaticVariable();
		obj2.num1 += 15;
		obj2.num2 += 15;
		System.out.println(obj2.num1);// 45 return eder
		System.out.println(obj2.num2);// 30 return eder.
		// Fark sudur: Static olanlarda degisiklik kalici digerlerinde degil. 
		// Bu yuzden static surekli ilaveye devam eder.
	}
	
		
	}



