package p1;

public class Addition extends Arithematic{
	
	public void Addition() {
		num1 = 20;
		num2 = 30;
	}

	public Addition(int x) {
		num1 = num2 = x;
	}

	public Addition(int x, int y) {
		num1 = x;
		num2 = y;
	}

	public Addition(String x, String y) {
		num1 = Integer.parseInt(x);
		num2 = Integer.parseInt(y);
	}

	public Addition(Addition ob) {
		this.num1 = ob.num1;
		this.num2 = ob.num2;
	}

	public void CalData() {
		num3 = num1 + num2;
	}

}
