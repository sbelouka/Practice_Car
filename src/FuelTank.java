

public class FuelTank extends CarPart implements FunctionalInterface {
	
	static float FuelLevelOfTank;  
	static int SizeOfTank; 
	private double gasPrice; 
	private int milesPerGallon; 
	int speedLimitofCar; 
	int fuelPump; 


/*
 * *****Create setters and getters***** 
 * 
 */
	
	
	public static float getFuelLevelOfTank() {
		return FuelLevelOfTank;
	}


	public static void setFuelLevelOfTank(float fuelLevelOfTank) {
		FuelLevelOfTank = fuelLevelOfTank;
	}


	public static float getSizeOfTank() {
		return SizeOfTank;
	}


	public static void setSizeOfTank(int sizeOfTank) {
		SizeOfTank = sizeOfTank;
	}


	public double getGasPrice() {
		return gasPrice;
	}


	public void setGasPrice(double gasPrice) {
		this.gasPrice = gasPrice;
	}


	public float getMilesPerGallon() {
		return milesPerGallon;
	}


	public void setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
	
	
	//Create calculate method to calculate gas in amount of miles traveled. 
	public void calculateGas(double gasPrice, float f) {
		
		System.out.println((gasPrice * f) / Engine.TripMileOfCar);
	
	}
	

	// Create a method to check if the car works
	public boolean carStatus(boolean carWorks) {
		 if (carWorks == true) {
			 
			 RemainingDurabilityOfPart = 100;
		 }
		 else {
			 RemainingDurabilityOfPart = 0; 
		 }
		 return carWorks; 
		
		 
		
	}
	

	// Override the interface function. 
	public void function () {
		
		System.out.println("Does your car start? " + carStatus(true));
			
		
	}


	@Override
	void status() {
		
		condition(RemainingDurabilityOfPart);
		
	}

}
