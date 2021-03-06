package oops2;

public class Oops2 {
	// State
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	// Creation
	public Oops2(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// isOn
	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}
	public void switchOn() {
		this.isOn = true;
	}
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// Print the State
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);
	}

}
