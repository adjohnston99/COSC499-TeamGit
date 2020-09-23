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
	//jodi :))

		return null;
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