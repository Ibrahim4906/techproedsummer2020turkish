package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// Abstract Class'lardan obje uretilemez.
		// Constractor'lari yoktur. 
		// Abstract Class'lar concrete(body'li) ve abstract(body'siz)
		// methodlar icerebilir.
		// Abstract Class'larin hem concrete Class hem de Abstract Class olan
		// child'leri olabilir.
		// Abstract Class'in child'i concrete Class ise Abstract Class'daki 
		// Abstract method'lari mutlaka override edilmeli ve onlara body 
		// eklenmelidir.
		// ==> Bunun faydasi sudur: Child Class'larda mecburen olmasi gereken
		// methodlari bu sekilde belirlemis oluruz. 
		// Abstract Class'in child'i abstract Class ise Abstract Class'daki
		// herhangibir seyi override etmek zorunda degildir.

	}
	
	public void concreteMethod() {
		System.out.println("Ben concrete'im");
	}
	public abstract void abstractMethod();
}
