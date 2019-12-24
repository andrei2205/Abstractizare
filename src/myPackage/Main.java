package myPackage;

public class Main {
	public static void main(String[] args)
	{
		
		Masina mas1 = new Masina(2019, "Ford");
		Imobil imob1 = new Imobil("Oradea", 50);
		
		mas1.articolBase(15000, "123456789");
		mas1.afisareMasina();
		
		imob1.articolBase(60000, "1234");
		imob1.afisareImobil();
		
	}
}
