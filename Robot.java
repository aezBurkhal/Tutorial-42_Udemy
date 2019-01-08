
public class Robot {

	private int id;
	
	//class Brain is within Robot class, will have access to instance data within robot class
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
		
	}
//type of inner class; Static class is a way of grouping classes together
	
	public static class Battery {
		//method
		public void charge() {
			//output
			System.out.println("Battery charging..." );
		}
	}
	
	public Robot(int id) {
		super();
		this.id = id;
	} 
	
	public void start() {
		System.out.println("Starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		//creates instance of Temp class
		Temp temp = new Temp();
		temp.doSomething();
		
	}
}
