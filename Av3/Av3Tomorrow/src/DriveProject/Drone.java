package DriveProject;

public class Drone extends Vehicle implements Drivery{

	public Drone(int battery) {
		super(battery);
	}

	@Override
	public void pilot() {		
		System.out.println("Pilotting");
	}
	
	
}
