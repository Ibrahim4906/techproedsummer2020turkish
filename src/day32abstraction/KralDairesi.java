package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		KralDairesi musteri3 = new KralDairesi();
		musteri3.kahvalti();
		System.out.println("TV ucreti: " + musteri3.tv("international", 5));
		System.out.println("Wi-fi ucreti: " + musteri3.wifi(4));
		
	}
	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz teras kat Kral Restaurant'dadir");
	}
	
	public int tv(String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		
		}

	}
}
