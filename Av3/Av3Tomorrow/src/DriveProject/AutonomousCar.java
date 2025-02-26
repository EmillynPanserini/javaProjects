package DriveProject;

public class AutonomousCar extends Vehicle implements Drivery, Rechargeable {

	public AutonomousCar(int battery) {
		super(battery);
	}
	public int Battery(int Battery) {
		return Battery;
	};

	@Override
	public void Recharge(int qtd) {
		System.out.println("Recharging");
	}

	@Override
	public void pilot() {
			System.out.println("Piloting");
		}
		

}
