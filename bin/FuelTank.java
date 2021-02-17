
public class FuelTank extends CarPart implements FunctionalInterface {
	
	// Create attributes
	static float FuelLevelOfTank;  
	static float SizeOfTank; 
	

	// Create instructor to initiate the attributes 
	public FuelTank( float FuelLevelOfTank, float SizeOfTank) {
		super(RemainingDurabilityOfPart);
		FuelTank.FuelLevelOfTank = FuelLevelOfTank; 
		FuelTank.SizeOfTank = SizeOfTank; 
		
		
	}
	
	
	
	public void function() {
		System.out.println("Fuel Tank is in good condition");
	}

	
	
	public void FuelTankCondition() {
		
	}


	@Override
	void status() {
		System.out.println("the tank is full of gas, you can drive more miles");
		
	}

}
