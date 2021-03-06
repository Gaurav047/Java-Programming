package oops.motorbike;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike Honda = new MotorBike(100);
		MotorBike Ducati = new MotorBike(20);

		System.out.println("Speed of Ducati is : " + Ducati.getSpeed());
		System.out.println("Speed of Honda is : " + Honda.getSpeed());

		Ducati.start();
		Honda.start();

		Ducati.setSpeed(100);
		Honda.setSpeed(50);

		System.out.println("Speed of Ducati is : " + Ducati.getSpeed());
		System.out.println("Speed of Honda is : " + Honda.getSpeed());

		Ducati.setSpeed(80);
		Honda.setSpeed(60);

		System.out.println("Speed of Ducati is : " + Ducati.getSpeed());
		System.out.println("Speed of Honda is : " + Honda.getSpeed());

	}

}
