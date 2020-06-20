package day30exceptions;

public class Soru {

	public static void main(String[] args) {
		try {
			hop();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());// Exception yakala ve sadece mesaji yazdir
		}
	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	

	}

}
