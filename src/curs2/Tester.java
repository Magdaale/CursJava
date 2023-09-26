package curs2;

public class Tester {
	
	//membrii clasei - var sau metode
	
	String nume;// String are val default = null // var de instanta
	int ratePerHour;// int  val default = 0
	
	//public Tester() {}; //constructor default fara param e default
	
	//public Tester(String denumire, int ratePerHour) {
	//	nume = denumire;
		//this.ratePerHour = ratePerHour;
		
	//}
	
	public Tester(String nume, int ratePerHour) {
		this.nume = nume;// var locala; nu poate fi fol in afara acoladei
		this.ratePerHour = ratePerHour;
		
	}
	

	

}

