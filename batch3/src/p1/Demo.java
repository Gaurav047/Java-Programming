package p1;

public class Demo {

	public static void main(String[] args) {
		Addition ob = new Addition("100", "99");
		ob.CalData();
		ob.display();

		Addition ob1 = new Addition(ob);
		ob1.CalData();
		ob1.display();

		ob = null;
		ob1 = null;
		System.gc();
	}

}
