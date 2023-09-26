package curs2;

public class Rectangle {

	public static void main(String[] args) {
	
		//program care calc aria unei camere
		
		//room1
		int lenght = 3;
		int width = 6;
		
		System.out.println("Aria camerei este :" + lenght*width);
		
		//room2
		int lenght2 = 11;
		int width2 = 41;
		
		System.out.println("Aria camerei este :" + lenght2*width2);
		System.out.println("-------------------------------");
		
		Rectangle hol = new Rectangle();
		System.out.println(hol.aria(2, 2));
		
		Rectangle baie = new Rectangle();
		System.out.println(baie.aria(2, 21));
		
		
		
		Rectangle casa = new Rectangle();
		int ariehol = hol.aria(2, 2);
		int ariebaie = baie.aria(4, 2);
		
		Rectangle dormitor = new Rectangle();
		System.out.println(dormitor.aria(34, 21));
		
		
		int ariedormitor = dormitor.aria(34,21);
		
		System.out.println("Aria totala este" + casa.ariaTotala(ariehol, ariebaie, ariedormitor));
		
		
		
		
		

		
		
		
	}
	
	
	
	
	public int aria(int lenght, int width) {
		
		return lenght*width;
	}
	
	
	public int ariaTotala(int baie, int hol, int dormitor) {
		return baie + hol + dormitor;
	}
	
	
	// varargs- fol var argument
	//obiect.ariaTotalaFolosingVarargs(int baie)
	//obiect.ariaTotalaFolosingVarargs(int hol)
	//obiect.ariaTotalaFolosingVarargs(dormitor, hol, baie)
	//camere = {dormitor, hol, baie}
	
	public int ariaTotalaFolosingVarargs(int...camere) {
		
		int sum = 0; 
		for(int room: camere) {
			sum += room;
		}
		
		return sum;
	}

}
