package p1;

public class Arithematic {
	int num1, num2, num3;

	public void Arithematic() {
		num1 = 20;
		num2 = 30;
	}

	public Arithematic(int x) {
		num1 = num2 = x;
	}

	public Arithematic(int x, int y) {
		num1 = x;
		num2 = y;
	}

	public Arithematic(String x, String y) {
		num1 = Integer.parseInt(x);
		num2 = Integer.parseInt(y);
	}

	public Arithematic(Arithematic ob) {
		this.num1 = ob.num1;
		this.num2 = ob.num2;
	}

	public void setData(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;
	}

	public void readData() {
		System.out.println("Enter the two Numbers : ");
		this.num1 = read.br.nextInt();
		this.num2 = read.br.nextInt();
	}

	public void CalData() {

	}

	public void display() {
		System.out.printf("num1=" + num1 + " num2= " + num2 + " num3 = " + num3).println();
	}
}
