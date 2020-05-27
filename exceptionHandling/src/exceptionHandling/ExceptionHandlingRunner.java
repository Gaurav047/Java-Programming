package exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method2();
		System.out.println("Main Ended");
	}

	private static void method2() {
		method1();
		System.out.println("Method1 Ended");
	}

	private static void method1() {
		try {
//			String str = null;
//			str.length();
			int[] i = { 1, 2 };
			int number = i[3];
			System.out.println("Method2 Ended");
		} catch (NullPointerException ex) {
			System.out.println("Matched NullPointerEception");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
	}

}
