package multithreading;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() { // Signature
		System.out.println("\n Task " + number + " Started. \n");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task " + number + " Completed.\n");

	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\n Task 2 Started. \n");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task 2 Completed.\n");

	}

}

public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		// Task 1
//		Task1 task1 = new Task1();
//		task1.setPriority(1);
//		task1.start();

		// Task 2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// Wait for task1 and task2 to complete
//		task1.join();
		task2Thread.join();

		// Task 3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task 3 Completed.\n");
	}
}
