package generics;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList();

		list.addElement("Element 1");
		list.addElement("Element 1");

		MyCustomList<Integer> list2 = new MyCustomList();

		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
	}

}
