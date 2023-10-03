package curs8;

public class TestProduct {

	public static void main(String[] args) {
		
		//Product produs = new Product();
		
		Shoes pantof = new Shoes(25,33);

		System.out.println(pantof.calculatePrice());
		
		pantof.ratingProduct();
 
		
		System.out.println("____________________________");
		
		TShirt tricou = new TShirt(1, 2, 3);
		System.out.println(tricou.calculatePrice());
		
		tricou.ratingProduct();
		
		
	}

}
