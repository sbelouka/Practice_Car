import java.util.Scanner;

//Create subclass Engine that extends from superclass CarPart and inherit interface by using implements
public class Engine extends CarPart implements FunctionalInterface {

		//Create a class attributes / properties 
	
		final static int MaxOdometerOfCarLast= 300_000;
	    static int CurrentOdometerReading ;
		String TypeOfEngine;
		int NumberOfCylinder;
		int HoursePower; 
		static int  TripMileOfCar; 
		
		
		
		//Create the constructor of the class to initialize the attributes. 
		public Engine( String typeOfEngine,int numberOfCylinder, int hoursePower, int tripMileOfCar, int CurrentOdometerReading) {
		super();
		this.CurrentOdometerReading = CurrentOdometerReading;
		TypeOfEngine = typeOfEngine;
		NumberOfCylinder = numberOfCylinder;
		HoursePower = hoursePower;
		TripMileOfCar = tripMileOfCar;
		
	}


	/* Create Create Getters and Setters
	 *  The purpose of the setters and getters to get data from user
	 */
		
	public int getTripMileOfCar() {
		
		return TripMileOfCar;
	}
	public int setTravelMileOfCar(int TripMileOfCar) {
		
		return TripMileOfCar;
	}
	public int getActualOdometerOfCar() {
		return CurrentOdometerReading;
	}

	public int setActualOdometerOfCar(int actualOdometerOfCar) {
		return CurrentOdometerReading;
	}

	public String getTypeOfEngine() {
		return TypeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		TypeOfEngine = typeOfEngine;
	}

	public int getNumberOfCylinder() {
		return NumberOfCylinder;
	}

	public void setNumberOfCylinder(int numberOfCylinder) {
		NumberOfCylinder = numberOfCylinder;
	}

	public int getHoursePower() {
		return HoursePower;
	}

	public void setHoursePower(int hoursePower) {
		HoursePower = hoursePower;
	}
	
	
	
	


	/* Create the CarOdometer method to check the mileage of the car.
	 * check the durability of the engine by its mileage,  
	 * If the engine has high mileage is likely to be broken, 
	 * otherwise the engine is in good shape. 
	 */
	
	
	
	
	 
	

	static void CarOdometer (int CurrentOdometerReading , int TripMileOfCar)  {
		
		int TargetOdometerOfCar = CurrentOdometerReading + TripMileOfCar;
		
		int MileOfCarLeft = MaxOdometerOfCarLast - TargetOdometerOfCar; 
		
		
				
		if  ( CurrentOdometerReading <= 0  &&  MileOfCarLeft <= 0  && MileOfCarLeft>= 0 ) {
			
			System.out.println("The odometer can not be 0 or negative");
		}
		
		
		else {
		 
				if ( TargetOdometerOfCar >= 300_000  || MileOfCarLeft >= 300_000  ) {
					
					 RemainingDurabilityOfPart = 0;
					
					}
				
				else if(TargetOdometerOfCar > 200_000 ){
					
					RemainingDurabilityOfPart = 50;
					
					}
				
				else if(TargetOdometerOfCar <= 200_000 || MileOfCarLeft <= 300_000){
					
					RemainingDurabilityOfPart = 100;
					
					}
		}
		}
			
	
	
		
	public void function() {
		
		System.out.println("The maximum mileage of the car is: "+ MaxOdometerOfCarLast);
		System.out.println("The actual mileage of the car is: "+ setActualOdometerOfCar(CurrentOdometerReading));
		System.out.println("The trip miles of the car is: " + getTripMileOfCar());
		CarOdometer(setActualOdometerOfCar(CurrentOdometerReading), setTravelMileOfCar(TripMileOfCar));
	}
	



	@Override
	void status() {
		
		 condition(RemainingDurabilityOfPart);
		 
	}
		
	}

	
	


