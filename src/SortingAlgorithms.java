import java.util.Random;

public class SortingAlgorithms {
	public static void main(String[] args) {
		Random random = new Random();

		Integer[] arr = new Integer[10000];

		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(10000);

		long bubbleSortStartTime = System.currentTimeMillis();

		long bubbleSortEndTime = System.currentTimeMillis();

		long insertionSortStartTime = System.currentTimeMillis();
		long insertionSortEndTime = System.currentTimeMillis();

		long mergeSortStartTime = System.currentTimeMillis();
		long mergeSortEndTime = System.currentTimeMillis();
	}

	public Object[] bubbleSort() {

		return null;
	}

	public Object[] insertionSort() {

		return null;
	}

	public Object[] mergeSort() {

		return null;
	}
}