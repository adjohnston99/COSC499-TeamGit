import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {
	public static void main(String[] args) {
		int size = 100;

		Random random = new Random();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(size);

		long bubbleSortStartTime = System.currentTimeMillis();
		int[] bubbleSorted = bubbleSort(arr);
		long bubbleSortEndTime = System.currentTimeMillis();

		long insertionSortStartTime = System.currentTimeMillis();
		int[] insertionSorted = insertionSort(arr);
		long insertionSortEndTime = System.currentTimeMillis();

		long mergeSortStartTime = System.currentTimeMillis();
		int[] mergeSorted = mergeSort(arr);
		long mergeSortEndTime = System.currentTimeMillis();

		System.out.println("Test array of size " + size + ": " + Arrays.toString(arr));
		System.out.println("Bubble sort took " + (bubbleSortEndTime - bubbleSortStartTime) + "ms");
		System.out.println("Insertion sort took " + (insertionSortEndTime - insertionSortStartTime) + "ms");
		System.out.println("Merge sort took " + (mergeSortEndTime - mergeSortStartTime) + "ms");
	}

	public static int[] bubbleSort(int[] a) {

		return null;
	}

	public static int[] insertionSort(int[] a) {
		int length = a.length;
		for(int i = 1; i < length; i ++){
			int pointer = a[i];
			int j = i - 1;

			while(j >= 0 && a[j] > pointer) {
				a[j+1] = a[j];
				j++;
			}
		}
		return a;
	}

	public static int[] mergeSort(int[] a) {
		if (a.length <= 1)
			return a;
		else {
			int[] f = new int[(a.length+1)/2];
			int[] b = new int[a.length - f.length];
			return mergeSort(f, b);
		}
	}

	public static int[] mergeSort(int[] a, int[] b) {
		return merge(mergeSort(a), mergeSort(b));
	}

	private static int[] merge(int[] a, int[] b) {
		int[] r = new int[a.length + b.length];
		int j = 0, k = 0;
		for (int i = 0; i < r.length; i++) {
			if (a[j] < b[k]) {
				r[i] = a[j];
				j++;
			} else {
				r[i] = b[k];
				k++;
			}
		}
		return r;
	}
}