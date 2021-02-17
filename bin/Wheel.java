
public class Wheel extends CarPart implements FunctionalInterface {
	
	
	public Wheel(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

		// Create a method of the class
		public void WheelCondition() {
			
		}
		
		public void function() {
			System.out.println("Wheel");
		}

		@Override
		void status() {
			System.out.println("The wheel is good");
			
		}
		

}
