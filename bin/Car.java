import java.util.ArrayList;

//Create a class Car 
public class Car {
	
	ArrayList<CarPart> array = new ArrayList<>(); 


	//Create Car class constructor 
	public Car() {
		
		// Create instance of each subclass 
		Engine      myEngine 	    =  new  Engine(1, "Electric Engine", 0, 0, 0, 0, 4,null, 0, 0, 0, 0); // Create an instance of a Engine object, and invoke that object's run() method.
		FuelTank    myFuelTank 	    =  new  FuelTank(2.30f, 34.5f); // Create an instance of a FuelTank object, and invoke that object's run() method.
		Tires       myTires		    =  new  Tires(0); // Create an instance of a Tires object, and invoke that object's run() method.
		Wheel       myWheel          =  new  Wheel(0); // Create an instance of a Wheel object, and invoke that object's run() method.
	
		
		//run(myEngine, myFuelTank, myTires , myWheel);
		
		//myEngine.setActualOdometerOfCar(150000);
		//myEngine.getActualOdometerOfCar(); 
		
		//myEngine.CarOdometer(150000, 150);
		myEngine.status();
		
		array.add(myEngine);
	
	}

	// Part:(5)The run() method of your Car class should iterate through the Car's collection of CarPart references, 
	// which stores the instances of the CarPart subclasses. On each iteration, 
	//the function() method of the current object in the collection should be invoked.

	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0; i < array.size(); i++) {
			
			array.get(i).function();
			
			array.get(i).status();
			
		}
		
		
	}
}
