package myPackage;

public class Imobil extends Articol{
	private String localitate;
	private int suprafata;
	public String getLocalitate() {
		return localitate;
	}
	public void setLocalitate(String localitate) {
		this.localitate = localitate;
	}
	public double getSuprafata() {
		return suprafata;
	}
	public void setSuprafata(int suprafata) {
		this.suprafata = suprafata;
	}
	public Imobil(String localitate1, int suprafata1)
	
	{
		super(pret, telefon);
		localitate = localitate1;
		suprafata = suprafata1; 
	}
	
	@Override
	public void articolBase(int pret, String telefon) {
		Articol.pret=pret;
		Articol.telefon=telefon;
	}
	
	public void afisareImobil()
	{
		System.out.println("Imobil in "+ localitate + " cu suprafata de " + suprafata + "m2 cu pretul de " + Articol.pret+ " euro.Pentru detalii sunati la:  "+ Articol.telefon);
	}
	
}
