package curs5;

public class BreakContinue {

	public static void main(String[] args) {
	
		
		
		for(int i = 0; i<10; i++) {
			if(i==6) {
				//break;
				continue; // nu ma scoate din loop, dar da skip la acea interatie
				
			}
			
			System.out.println(i);
			
		}
		System.out.println("Exit");
	}

}
