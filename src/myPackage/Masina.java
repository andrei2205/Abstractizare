package myPackage;

public class Masina extends Articol {
	private int an_fabricatie;
	private String marca;
	
	public int getAn_fabricatie() {
		return an_fabricatie;
	}
	public void setAn_fabricatie(int an_fabricatie) {
		this.an_fabricatie = an_fabricatie;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Masina(int an_fabricatie1,String marca1)
	{
		super(pret, telefon);
		an_fabricatie = an_fabricatie1;
		marca = marca1;
	}
	
	@Override
	public void articolBase(int pret, String telefon) {
		Articol.pret=pret;
		Articol.telefon=telefon;
		
	}
	
	public void afisareMasina()
	{
		System.out.println("Masina fabricata in anul " + an_fabricatie + " marca " + marca + " cu pretul de " + Articol.pret + " euro.Pentru detalii sunati la: " + Articol.telefon);
	}
}
