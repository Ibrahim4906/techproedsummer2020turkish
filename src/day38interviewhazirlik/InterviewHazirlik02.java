package day38interviewhazirlik;

public class InterviewHazirlik02 {
	// 14) Access Modifier nedir?
	// 			Bir Class'a , variable'a ya da methoda'a ulasimi duzenler.
	// 			4 tane access modifier vardir. Bunlar:
	// 			A) Public: Herkes ulasabilir.
	// 			B) Protected: Ayni package icinden ve farkli package'lerdeki child Class'lardan ulasilabilir
	// 			C) Default(Package Private): Sadece ayni package'den ulasilabilir.
	// 			D) Private: Sadece Class icinden ulasilabilir.
	
	// 15) Pass by Value ve Pass by Reference nedir?
	// 			Bir method'a variable yollandiginda Java o variable'in
	// 			kopyasini olusturur ve method'a kopyayi yollar bu yuzden variable'in
	// 			orjinal degeri method calistiktan sonra da ayni kalir.
	//			Buna Pass By Value denir.
	
	// 			Pass by Reference'da ise reference'in kopyasi olusturulur ve methoda yollanir
	// 			fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin orjinal
	// 			deger degisir.
	
	// 16) Abstract Class ile Interface farklari nedir?
	//			Abstract Class'lar multiple inheritance'a musaade etmez. Interface'ler eder.
	// 			Interface'de abstract methodlar olur, concrete methodlar static ve default keywordleri ile olusturulur
	// 			halbuki abstract Class'larda normal concrete method'lar bulunabilir.
	// 			Interface'lerin variable'leri public, static, final olmak zorundadir ve initialize edilmelidirler.
	// 			Halbuki abstract Class'larda bu zorunluluklarin hicbirisi yoktur. Bir interface'in parent'i 
	//			Class olamaz. Child'i Class'da , interface'de olur. Ama abstractlarin childi da parenti de hem
	// 			abstract Class hem de concrete Class olur. 
}
