package curs9;


/* 
 * produse de tip dulciuri
 * nume produse si pret produs (pret + tva) au dulciurile 
 * Stim ca unele produse se vand la buc
 * mai stim ca unele produse se vand la kilogram (pret/0.5 + tva)
 * stim ca unele produse se vand la bax
 * 
 * vreau sa printez ai in total x produse 
 * costul total este de : cost total x produse
 * 
 * */

public class CasaDeMarcat {
	
	int nrItem = 0;
	//Ciocolata poiana = new Ciocolata;
	
	
	Dulciuri[] produseDulce = new Dulciuri[3];
	//Bomboane rafaelo = new Bomboane();
	
	
	public void enterItems(Dulciuri dulce) {
		produseDulce[nrItem] = dulce;
		nrItem++;
		
	}
	
	
	
	public double costTotal() {
		double total = 0; 
		for(Dulciuri dulce: produseDulce) {
			total = total + dulce.calculatePrice();
		}
		return total;
	}
	
	
	
	public static void main(String[] args) {
		
		CasaDeMarcat casademarcat = new CasaDeMarcat();
		casademarcat.enterItems(new Bomboane("tictac",2,5));
		casademarcat.enterItems(new Ciocolata("poiana",4));
		casademarcat.enterItems(new Napolitane("joe",45));
		
		
		System.out.println("Ai un total de  " + casademarcat.produseDulce.length + " produse dulce ");
		System.out.println("Ai un platit " + casademarcat.costTotal() + " lei ");
	}

}
