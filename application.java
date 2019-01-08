

public class application {
	public static void main(String[] args) {
		
		/*anonomous class is type of inner class
		 * 
		 */
		Robot robot = new Robot(7);
		robot.start();
		
		//Robot.Brain brain = robot.new Brain();
		//brain.think(); ( only if brain was declared public)
		
		
		//syntax
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
