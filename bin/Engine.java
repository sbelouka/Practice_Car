

//Create subclass Engine that extends from superclass CarPart and inherit interface by using implements
class Engine extends CarPart implements FunctionalInterface {
	
		//Create a class attributes / properties 
		static final int MaxOdometerOfCarLast= 300000;
	    static int ActualOdometerOfCar ;
	    static int TargetOdometerOfCar; 
		String TypeOfEngine;
		int NumberOfCylinder;
		int HoursePower; 
		
	
	
	//Create constructor to initiate the attributes
			public Engine (int number, String typeOfEngine2, int hoursePower2, int targetOdometerOfCar2,
			int maxOdometerOfCarLast2, int actualOdometerOfCar2, int numberOfCylinder2, String TypeOfEngine, int HoursePower, int ActualOdometerOfCar, int TargetOdometerOfCar, int NumberOfCylinder) {
		
		super(RemainingDurabilityOfPart);
		this.TypeOfEngine = TypeOfEngine;
		this.HoursePower = HoursePower;
		Engine.ActualOdometerOfCar = ActualOdometerOfCar; 
		Engine.TargetOdometerOfCar = TargetOdometerOfCar; 
		this.TypeOfEngine        =  TypeOfEngine; 
		this.NumberOfCylinder 	 = NumberOfCylinder; 
		
	}
	

	
	/* Create Create Getters and Setters
	 *  The purpose of the setters and getters to get data from user
	 */
		
	
	public int getActualOdometerOfCar() {
		return ActualOdometerOfCar;
	}

	public void setActualOdometerOfCar(int actualOdometerOfCar) {
		Engine.ActualOdometerOfCar = actualOdometerOfCar;
	}

	public int getTargetOdometerOfCar() {
		return TargetOdometerOfCar;
	}

	public void setTargetOdometerOfCar(int targetOdometerOfCar) {
		TargetOdometerOfCar = targetOdometerOfCar;
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
	
	

	public void function() {
		System.out.println("Engine is in good condition");
	}



	// Override the status method. 


	public void CarOdometer (int ActualOdometerOfCar , int TravelMileOfCar)  {
		
		TargetOdometerOfCar = TravelMileOfCar + ActualOdometerOfCar;
		
		int MileOfCarLeft = MaxOdometerOfCarLast - TargetOdometerOfCar; 
		
		System.out.println("The actual odometer of the car is " + ActualOdometerOfCar + " Miles.");
		System.out.println("The Maximum odometer of the car can reatch is " + MaxOdometerOfCarLast + " Miles.");
		System.out.println("The odometer after travelling will be " + TargetOdometerOfCar );
		System.out.println("Miles left after travelling will be " + MileOfCarLeft );
		System.out.println("This is " + CarPart.RemainingDurabilityOfPart );
		
		
		if ( ActualOdometerOfCar >= 300000 ) {
			
			System.out.println("The engine is broken");
			
			}
		
		else if(ActualOdometerOfCar > 150000 ){
			
			System.out.println("The engine needs to be checked");
			
			}
		
		else if(MileOfCarLeft <= 150000){
			
			System.out.println("The engine is in good condition");
			
			}

		else {
			
			throw new IllegalArgumentException("The odometer can not be 0 or negative");
			}
		}



	@Override
	void status() {
		// TODO Auto-generated method stub
		System.out.println("Engine is good");
		
	}
		
	}

	
	


