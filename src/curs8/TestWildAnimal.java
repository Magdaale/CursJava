package curs8;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		/*WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
			System.out.println("_________________________________________________");
		
		
		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		
		System.out.println("_________________________________________________");
		
		Lion simba = new Lion();
		
		simba.makeSound();
		simba.eatMeat();

	}*/
		
		//Webdriver browser = new ChromeDriver();
		
		WildAnimal simba = new Lion();// se poate doar pt ca exista relatia de mostenire
		 //datatype               instanta
		//zona de polimorfism
		
		simba.makeSound();
		
		((Lion) simba).eatMeat();
		
		simba = new Deer();
		simba.makeSound();
		((Deer) simba).eatGrass();
		feedAnimal(simba);//this is polimorfism
	}
	
	public static void feedAnimal(WildAnimal animal) {
		if(animal instanceof Lion) {
			System.out.println("You get burgers");
		}else if(animal instanceof Deer) {
			System.out.println("You get salad");
		}
		
		
	}
}
