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
	//jodi :))

		return null;
	}

	public static Object[] mergeSort(Object[] a) {
		if (a.length <= 1)
			return a;
		else {
			Object[] f = new Object[(a.length+1)/2];
			Object[] b = new Object[a.length - f.length];
			return mergeSort(f, b);
		}
	}

	public static Object[] mergeSort(Object[] a, Object[] b) {
		return merge(mergeSort(a), mergeSort(b));
	}

	private static Object[] merge(Object[] a, Object[] b) {
		Object[] r = new Object[a.length + b.length];
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

//	public static int[] mergeSort(int[] toSort, int n) {
//	    if (n < 2) {
//	        return toSort;
//	    }
//	    int mid = n / 2;
//	    int[] a = new int[mid];
//	    int[] b = new int[n - mid];
//
//	    for (int i = 0; i < mid; i++) {
//	        a[i] = toSort[i];
//	    }
//	    for (int i = mid; i < n; i++) {
//	        b[i - mid] = toSort[i];
//	    }
//	    mergeSort(a, mid);
//	    mergeSort(b, n - mid);
//
//	    merge(toSort, a, b, mid, n - mid);
//	    return toSort ;
//	}
//
//	public static void merge (int[] a, int[] l, int[] r, int left, int right) {
//
//	    int i = 0, j = 0, k = 0;
//	    while (i < left && j < right) {
//	        if (l[i] <= r[j]) {
//	            a[k++] = l[i++];
//	        }
//	        else {
//	            a[k++] = r[j++];
//	        }
//	    }
//	    while (i < left) {
//	        a[k++] = l[i++];
//	    }
//	    while (j < right) {
//	        a[k++] = r[j++];
//	    }
//	}
}