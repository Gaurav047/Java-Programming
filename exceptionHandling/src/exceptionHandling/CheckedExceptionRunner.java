package exceptionHandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

	private static void someOtherMethod2() throws RuntimeException {
	}
}
