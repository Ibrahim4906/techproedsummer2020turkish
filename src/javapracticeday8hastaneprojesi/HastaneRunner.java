package javapracticeday8hastaneprojesi;

public class HastaneRunner {

	private static Hastane hastane = new Hastane();// Bu object main method disinda olusturuldu. Cunku class disindan 
	// veri cagiracagim. Main icinden bunu yapamam. 
	// Hastane uzerine gelip kontrol click yaparsak direk Hastane Class'ina gecis yapabiliriz.
	
	public static void main(String[] args) {
		
		String hastaDurumu = "Kalp hastaliklari";
		String unvan = doktorUnvan(hastaDurumu);
		
		hastane.setDoktor(doktorBul(unvan));
		System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
		System.out.println("Doktor soyisim: " + hastane.getDoktor().getSoyIsim());
		System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());
	}
	
public static String doktorUnvan(String aktuelDurum) { 
        
        if(aktuelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];
        }else if(aktuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];
        }else if(aktuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];
        }else if(aktuelDurum.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];
        }else if(aktuelDurum.equals("Migren")) {
            return hastane.unvanlar[4];
        }else if (aktuelDurum.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }
        
        return "yanlis durum";
        
    	}
public static Doktor doktorBul(String unvan) {
	Doktor doktor = new Doktor();
	
	for(int i=0; i<hastane.unvanlar.length; i++) {
		if(unvan.equals(hastane.unvanlar[i])){
			doktor.setIsim(hastane.doctorIsimleri[i]);
			doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
			doktor.setUnvan(hastane.unvanlar[i]);
		}
	}
	return doktor;
}
	}

