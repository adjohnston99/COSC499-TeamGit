import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {
	public static void main(String[] args) {
		int size = 100;

		Random random = new Random();

		Integer[] arr = new Integer[size];

		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(size);

		long bubbleSortStartTime = System.currentTimeMillis();
		Object[] bubbleSorted = bubbleSort(arr);
		long bubbleSortEndTime = System.currentTimeMillis();

		long insertionSortStartTime = System.currentTimeMillis();
		Object[] insertionSorted = insertionSort(arr);
		long insertionSortEndTime = System.currentTimeMillis();

		long mergeSortStartTime = System.currentTimeMillis();
		Object[] mergeSorted = mergeSort(arr);
		long mergeSortEndTime = System.currentTimeMillis();

		System.out.println("Test array of size " + size + ": " + Arrays.toString(arr));
		System.out.println("Bubble sort took " + (bubbleSortEndTime - bubbleSortStartTime) + "ms");
		System.out.println("Insertion sort took " + (insertionSortEndTime - insertionSortStartTime) + "ms");
		System.out.println("Merge sort took " + (mergeSortEndTime - mergeSortStartTime) + "ms");
	}

	public static Object[] bubbleSort(Object[] a) {

		return null;
	}

	public static Object[] insertionSort(Object[] a) {

		return null;
	}

	public static Object[] mergeSort(Object[] a) {

		return null;
	}
}