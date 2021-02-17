

public class Tires extends CarPart implements FunctionalInterface {
	
	static String Tires;
	static int TireSizeNumber; 
	float tiretreadDepth; 
	double wearTearOfTire; 
	double tirePresure; 
	
	
	
	
	public Tires(float tiretreadDepth, double tirePresure) {
		super();
		this.tiretreadDepth = tiretreadDepth;
		this.tirePresure = tirePresure;
	}


		// Create a method of the class
		public void tiresCondition(double tiretreadDepth, double tirePresure ) {
			
			if ( tiretreadDepth < 0 || tirePresure < 0 ) {
				
				   System.out.println("Negative number entered");
				   
				}
			
			else if (tiretreadDepth >= 0.063 && 30 <= tirePresure && tirePresure <= 35 ) {
					
				RemainingDurabilityOfPart = 100;
			}
				
			else{
					
				RemainingDurabilityOfPart = 0;
			}
			
			
		}
			
		
		public void function() {
				tiresCondition(-2, 30);
			}
		
		

		@Override
		void status() {
			condition(RemainingDurabilityOfPart);
			
		}
		

}
