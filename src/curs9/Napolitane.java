package curs9;

public class Napolitane extends Dulciuri {
	// nume_metoda_care_face ---> snake case
	//java " camelCase
	//UpperCamelCase pt clase
	// lowerCamelCase pt var si metode
	
	public final double CANTITATE = 10; //E constanta si pot fi statice: public static final double 
	
	
	public Napolitane(String nume, double pretVanzare) {
		setNume(nume);
		setPretVanzare(pretVanzare);
		
	}
	
	
 @Override
	public double calculatePrice() {
		return getPretVanzare()*CANTITATE + 19;
		
	}
 
    
	
    
    

}
