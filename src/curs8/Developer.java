package curs8;

public class Developer implements Angajat {
	
	String name;
	String email;
	

	@Override
	public void setName( String name) {
		this.name = name;
	}

	@Override
	public String getName(String name) {
			return name;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
		
	}

	@Override
	public String getEmail(String email) {
			return email;
	}
	
	@Override
	public  void departament() {
		System.out.println("DEV");
	}
	
	


	

}
