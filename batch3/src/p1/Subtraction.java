package p1;

public class Subtraction extends Arithematic {

	public void Subtraction() {
		num1 = 20;
		num2 = 30;
	}

	public Subtraction(int x) {
		num1 = num2 = x;
	}

	public Subtraction(int x, int y) {
		num1 = x;
		num2 = y;
	}

	public Subtraction(String x, String y) {
		num1 = Integer.parseInt(x);
		num2 = Integer.parseInt(y);
	}

	public Subtraction(Subtraction ob) {
		this.num1 = ob.num1;
		this.num2 = ob.num2;
	}

}
