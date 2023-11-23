package callable_thread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Integer> arrayToSort = List.of(4, 3, 2, 7, 6, 1, 5, 8);
		MergeSorter mergeSorter = new MergeSorter(arrayToSort);
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<List<Integer>> future = executorService.submit(mergeSorter);
//		var sortedArray = executorService.submit(mergeSorter);
		
		System.out.println(future.get());
		executorService.shutdown();
	}

}
