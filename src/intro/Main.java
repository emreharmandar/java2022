package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
        
		// değişken isimlendirmeleri javada camelCase yazılır
		String ortaMetin ="ilginizi çekebilir";
		String altMetin	 ="Vade Süresi";
		
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		//integer tam sayı
		int vade = 12;
		
		
		//ondalıklı sayı
		double dolarDun = 18.25;
		double dolarBugun = 18.20;
		
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		}
		else {
			okYonu = "equel.svg";
			System.out.println(okYonu);
		}
		
				
		//array hepsiburada listeleri
		
		String [] krediler = {"Hızlı kredi","Maaşını Halkbanktan", "Mutlu Emekli"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
	}

}
