import java.util.ArrayList;

/*
 * The run() method of your Car class should iterate through the Car's collection of CarPart references, 
	which stores the instances of the CarPart subclasses. On each iteration, 
	the function() method of the current object in the collection should be invoked.
 */

public class Car {
	
	// Create Array list to iterate through the car's collection. 
	ArrayList<CarPart> array = new ArrayList<>(); 
	
	CarPart carpart = new CarPart() {
		
		@Override
		void status() {
			
		}
	};


	//Create Car class constructor to initialize the objects of the class. 
	public Car() {
		
		// Create instance of each subclass 
		// Create an instance of a Engine object, and invoke that object's run() method.
		// Create an instance of a FuelTank object, and invoke that object's run() method.
		// Create an instance of a Wheel object, and invoke that object's run() method.

		Engine      myEngine 	    =  new  Engine( "V4", 4, 120, 150, 200000); 
		FuelTank    myFuelTank 	    =  new  FuelTank();  
		Tires       myTire         =  new  Tires(0, 0); 
	
		
		/*
		 * We can write setters to set values to the attributes of the instances 
		 */
		

		array.add(myEngine);
		array.add(myFuelTank);
		array.add(myTire);
		
	
	}

	

	public void run() {
		
		for(int i =0; i < array.size(); i++) {
			
			array.get(i).function();
			
			array.get(i).status();		
			
		}
		
		
	}
}
