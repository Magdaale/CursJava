package curs8;

public abstract class Product {
	
	public abstract int calculatePrice(); //metoda abstract nu are body si ea obliga clasa copil sa implementeze metoda din clasa parinte
	//clasa abstracta permite si metode cu implementare si fara 
	// interfata are doar metode fara implementare
	
	public void ratingProduct() {
		
		System.out.println("xxxxxxxx");
	}
	
	
}
