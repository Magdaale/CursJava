package curs8;

public class TShirt extends Product {
	
	private int price;
	private int vat;
	public int adaos;
	
	public TShirt (int price, int vat, int adaos) {
		this.price = price;
		this.vat = vat;
		this.adaos= adaos;
		
	}

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return price + vat + adaos;
	}

}
