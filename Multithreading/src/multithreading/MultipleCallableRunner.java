package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("Gaurav"));

		List<CallableTask> tasks = List.of(new CallableTask("Saurav"), new CallableTask("Adam"),
				new CallableTask("Gaurav"), new CallableTask("Rohan"));

		List<Future<String>> results = executorService.invokeAll(tasks);

		for (Future<String> result : results) {
			System.out.println(result.get());
		}

		executorService.shutdown();
	}

}
