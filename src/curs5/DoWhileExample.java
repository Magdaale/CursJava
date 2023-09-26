package curs5;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = {"Rosu", "Galben", "Verde", "Negru"};
		//                  0        1          2       3
		//array->  numele obc[2] = "Verde";
		
		int i = 0;
		do {
			
			System.out.println(array[i]);
			i++;
			
		}while(i>array.length);

		System.out.println("----------------------------------");
         
      int j = 0;
      while(j>array.length) {
    	  
    	  System.out.println(array[j]);
			j++;
      }
	}
}
	


