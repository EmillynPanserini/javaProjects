package DriveProject;

public class Main {

	public static void main(String[] args) {
		
		AutonomousCar autonomousCar = new AutonomousCar(15);
		autonomousCar.Battery(15);
		try {
			if(autonomousCar.Battery(16) >= 15){
				autonomousCar.pilot();
				System.out.println("Correct");
			}
			
		}
		catch(Exception e){
			System.out.println("Low battery");
		}
		finally {
			System.out.println("Lets go");
		}
	}

}
