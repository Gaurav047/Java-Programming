package oops2;

public class Oops2Runner {

	public static void main(String[] args) {
		Oops2 fan = new Oops2("Manufacturer 1", 0.34567, "GREEN");
		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
