

// Create a CarPart class.The CarPart class implements FunctionalInterface interface. 

public abstract class CarPart implements FunctionalInterface  {
	
	//(1) condition - an integer that represents the remaining durability of the part (starts at 100, goes down to 0 when the part is broken)
	//Create a class attribute.
	
	static int RemainingDurabilityOfPart;
	
	
	
	//Create condition method
	public void condition(int number){ 
		
		if (RemainingDurabilityOfPart == 100) {
			
			
			System.out.println("Your car is in good shape. You can drive it. Have a nice trip!");
		}
		
		else if(RemainingDurabilityOfPart == 50) {
			
			
			System.out.println("The part needs to be checked by a Mechanic");
			
		}
		
		else {
			
			System.out.println("The car has broken down, needs to be checked by a Mechanic");
		}
	
		
	
	}

	
	
	/* The function method checks if all parts(Subclasses) of Carpart(superclass) return
	 * RemainingDurabilityOfPart == 100 will display all parts are good. Otherwise will
	 * display "One of the part's car is broken. You can not drive the car."
	 */
	@Override
	public void function() {
		
		if(CarPart.RemainingDurabilityOfPart==100) {
			
			
			System.out.println("All parts are in good function properly. You can drive your car");
	
		}
		
		else
		
		System.out.println("One of the part's car is broken. You can not drive the car.");
		
		
	}

	// Create the status() method that prints the condition of the part to the console.
	 abstract void status();

}




