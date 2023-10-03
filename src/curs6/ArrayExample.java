package curs6;

public class ArrayExample {

	public static void main(String[] args) {

// poate tine obiecte de clase, stringuri, alte array uri 
		
		String[] textArray = new String[4];// care este marimea sau sloturi; 
		//are o structura fixa, tre sa aiba de la creare si dimensiunea
		// datatype e string, array, memoria java 4 sloturi toate cu null
		//String[] textArray = {null, null, null, null}
		                         // 0     1   2     3
		System.out.println(textArray[0]);
		textArray[0] = "This";
				//String[] textArray = {"This", null, null, null}
        // 0     1   2     3
        System.out.println(textArray[0]);
        textArray[1] = " is";
        System.out.println(textArray[1]);
        textArray[2] = " an";
        System.out.println(textArray[2]);
        textArray[3] = " array";
        System.out.println(textArray[3]);
        
        //se parcurge cu un for
        System.out.println("--------------------------------");
        
        
        for(int i= 0; i < textArray.length; i++) {
        	System.out.print(textArray[i]);
        	
        }
        
        System.out.println("\n--------------------------------");
        
        
        //foreach
        //in spate :
        /*
         * while(textArray.hasNext() ) {}
         */
        
        for(String element: textArray) {
        	System.out.print(element);
        }
        
	}

}
