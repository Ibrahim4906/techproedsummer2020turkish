package javapracticeday4;

public class PasswordOlusturma {

	public static void main(String[] args) {
		
		// Sifre olusturunuz.
		// Uzunlugu en az 10 karakter olmali.
		// En az 1 sembol, 1 numara, 1 buyuk harf ve 1 kucuk harf olmalidir.
		String sembol = "!§$%&)=";
		String password = "A!l467K%wR";
		String rakam = "0123456789";
		
		int numOfSembol = 0;
		int numOfRakam = 0;
		int numOfBuyukHarf = 0;
		int numOfKucukHarf = 0;
		
			
		if (password.length() >=10) {
			
			for ( int i=0; i < password.length(); i++ ) {
				
				if (sembol.contains(password.substring(i,i+1))) {
					numOfSembol++;
				}
				if (rakam.contains(password.substring(i,i+1))){
					numOfRakam++;
				}
				if(password.charAt(i) >='a' && password.charAt(i) <='z'){
					numOfKucukHarf++;
					
				}
				if ( password.charAt(i) >='A' && password.charAt(i) <='Z') {
					numOfBuyukHarf++;
				}
			}
			if ( numOfSembol > 0 && numOfRakam > 0 && numOfBuyukHarf >0 && numOfKucukHarf > 0) {
				
				System.out.println("Tebrikler");
				System.out.println("Password'unuz basarili bir sekilde olusturulmustur");
			}else {
				System.out.println("Maalesef sembol kullanmadiginiz icin password olusturulamadi");
			}
			
			
		}else {
			System.out.println("Password length yeterli degil");
			System.out.println("Lutfen daha guclu hale getiriniz");
		}

	}

}
