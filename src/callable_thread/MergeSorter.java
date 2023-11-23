package callable_thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>>{
	private List<Integer> arrayToSort;
	
	public MergeSorter(List<Integer> arrayToSort) {
		this.arrayToSort=arrayToSort;
	}
	
	@Override
	public List<Integer> call() throws Exception {
		if (arrayToSort.size()<=1) return arrayToSort;
		int mid=arrayToSort.size()/2;
		
		List<Integer> leftArray = new ArrayList<>();
		List<Integer> rightArray = new ArrayList<>();
		
		for (int i=0; i<mid; i++) {
			leftArray.add(arrayToSort.get(i));
		}
		
		for (int i=mid; i<arrayToSort.size(); i++) {
			rightArray.add(arrayToSort.get(i));
		}
		
		MergeSorter leftMergeSorter = new MergeSorter(leftArray);
		MergeSorter rightMergeSorter = new MergeSorter(rightArray);
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter);
		Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);

		
		List<Integer> leftSortedArray = leftSortedArrayFuture.get();
		List<Integer> rightSortedArray = rightSortedArrayFuture.get();

		int i=0, j=0;
		List<Integer> sortedArray= new ArrayList<>();
		while (i<leftSortedArray.size() && j<rightSortedArray.size()) {
			if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
				sortedArray.add(leftSortedArray.get(i));
				i++;
			} else {
				sortedArray.add(rightSortedArray.get(i));
				j++;
			}
		}
		
		while(i<leftSortedArray.size()) {
			sortedArray.add(leftSortedArray.get(i));
			i++;
		}
		
		while(j<rightSortedArray.size()) {
			sortedArray.add(rightSortedArray.get(j));
			j++;
		}
		executorService.shutdown();
		return sortedArray;
	}

}
