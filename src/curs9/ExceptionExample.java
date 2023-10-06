package curs9;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]days = {"L", "M", "M", "J", "V", "S", "S",};
// INDEX POZITIE         0                             6
//TOTAL 7 ELEMENTE
		
		
		try {
			System.out.println(days[8]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nu mai accesa in afara array ului");
			
		}
		// e este un obiect 
		
	
		
		String nume = "Bob";
		System.out.println(nume.length());
		
		
		
	}

}
