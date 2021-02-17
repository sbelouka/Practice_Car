
// Create a CarPart class.The CarPart class implements FunctionalInterface interface. 

public abstract class CarPart implements FunctionalInterface  {
	
	//(1) condition - an integer that represents the remaining durability of the part (starts at 100, goes down to 0 when the part is broken)
	//Create a class attribute.
	
	static int RemainingDurabilityOfPart;
	
	
	

	// Create a class instructor for the CartPart class
	public CarPart(int number) {
		
		RemainingDurabilityOfPart =  (Engine.MaxOdometerOfCarLast - Engine.ActualOdometerOfCar)  ; 
		
	}
	
	@Override
	public void function() {
		// TODO Auto-generated method stub
		
	}

	// 2.status() - a method that prints the condition of the part to the console.
	 abstract void status();


}




