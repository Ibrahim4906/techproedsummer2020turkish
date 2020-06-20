package javapracticeday7;

public class HastaRunner {

	public static void main(String[] args) {
		Hasta hasta1 = new Hasta();
		Case durum = new Case();// Bu sekilde diger Class'tan method cagirmak icin object olusturulur
								// Veri alacagimiz Class ismi Case oldugu icin bu sekilde baslanmak zorunda
		
		durum.setActualCase("Romatizma");
		durum.setEmergency("Normal");
		
		hasta1.setIsim("Nevzat");
		hasta1.setSoyIsim("Toprak");
		hasta1.setSuankiDurum(durum);
		
		System.out.println("Hastanin ismi: " + hasta1.getIsim());
		System.out.println("Hastanin soyismi: " + hasta1.getSoyIsim());
		System.out.println("Hastanin aktuel durumu: " + hasta1.getSuankiDurum().getActualCase()); 
		System.out.println("Hastanin aciliyet durumu: " + hasta1.getSuankiDurum().getActualCase());
		
		System.out.println("Durum: " + durum.getActualCase());
		System.out.println("Hastanin durumu: " + hasta1.getSuankiDurum().getEmergency());
		

	}

}
