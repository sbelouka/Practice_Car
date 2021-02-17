
public class Tires extends CarPart implements FunctionalInterface {
	
	public Tires(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}



	//Create instance variable of Tires class.
	static String Tires;
	static int TireSizeNumber; 
	
	
	
	// Create a method of the class
	public void TiresCondition() {
		
	}
	
	public void function() {
		System.out.println("Tires");
	}



	@Override
	void status() {
		System.out.println("The tire is good");
		
	}
	
	

}
