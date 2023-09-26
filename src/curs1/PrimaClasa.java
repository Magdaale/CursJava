package curs1;

// numele claselor este intotdeauna UpperCamelCase
public class PrimaClasa {

	//conventie nume pachete java
	//microsoft.com in proiectul edge
	//com.microsoft.edge. - domain name 
	
	public static void main(String[] args) {
		System.out.println("Test");
		
		PrimaClasa obiect = new PrimaClasa(); 
		obiect.sendMessage();
		
		System.out.println(obiect.afiseazaSuma());
		//System.out.println(obiect.sendMessage());
		
		int numar = 10 + obiect.afiseazaSuma();
		System.out.println(numar);
		

	}
	
//numele metodelor si variabilelor este scris cu lowerCamelCase
		
	public void sendMessage() {
		System.out.println("Message");
	}

	
	public int afiseazaSuma() {
		int suma = 20 +30;
		return suma;
	}
	
}
