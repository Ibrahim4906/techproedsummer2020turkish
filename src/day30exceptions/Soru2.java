package day30exceptions;

public class Soru2 {

	public static void main(String[] args) {
		try {
			hop();
		}catch (Exception e) {
			e.printStackTrace();// printStackTrace() methodu Exception'larin nerede
			// olustugunun detayli bilgisini verir.
			// Exception satirlarini olusum sirasina gore console'da verir.
		}

	}
	private static void hop () {
		throw new RuntimeException("cannot hop");
}

}
