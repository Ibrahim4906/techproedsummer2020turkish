package day31abstraction;

public class Abstraction02 extends Abstraction01{

	public static void main(String[] args) {
		
		Abstraction02 obj = new Abstraction02();
		obj.abstractMethod();// "Abstract methodun override edilmis hali"
		obj.concreteMethod();// "Ben concrete'im"(Diger Classtan geliyor)

		

	}

	@Override// Bu ifadeyi Java otomatik olarak yazdiriyor. Class isminde
	// Abstraction02 alti kirmizi cizili iken fix ettik. 
	public void abstractMethod() {
		
		System.out.println("Abstract methodun override edilmis hali");
	}
	
	
}
