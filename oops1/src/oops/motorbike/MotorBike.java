package oops.motorbike;

public class MotorBike {
	// State
	private int speed;

	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Bike Started!");
	}
}
