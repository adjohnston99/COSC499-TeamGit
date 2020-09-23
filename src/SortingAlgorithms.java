import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {
	public static void main(String[] args) {
		int size = 100;

		Random random = new Random();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(size);

		System.out.println("Test array of size " + size + ": " + Arrays.toString(arr));

		long bubbleSortStartTime = System.currentTimeMillis();
//		int[] bubbleSorted = bubbleSort(arr);
		long bubbleSortEndTime = System.currentTimeMillis();

		long insertionSortStartTime = System.currentTimeMillis();
//		int[] insertionSorted = insertionSort(arr);
		long insertionSortEndTime = System.currentTimeMillis();

		long selectionSortStartTime = System.currentTimeMillis();
		int[] selectionSorted = selectionSort(arr);
		long selectionSortEndTime = System.currentTimeMillis();

		System.out.println("Bubble sort took " + (bubbleSortEndTime - bubbleSortStartTime) + "ms");
		System.out.println("Insertion sort took " + (insertionSortEndTime - insertionSortStartTime) + "ms");
		System.out.println("Merge sort took " + (selectionSortEndTime - selectionSortStartTime) + "ms");
	}

	public static int[] bubbleSort(int[] array) {
		//Rohan :)
		 int l = array.length;
	        for (int i = 0; i < l-1; i++)
	            for (int j = 0; j < l-i-1; j++)
	                if (array[j] > array[j+1])
	                {
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	        return array;
	}

	//jodi :))
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

	public static int[] selectionSort(int[] a) {
		int[] r = new int[a.length];
		for (int i = 0; i < r.length; i++) {
			int min = a[i];
			for (int j = i; j < a.length; j++) {
				min = (a[j] < min)? a[j] : min;
			}
			r[i] = min;
		}
		return r;
	}

//	public static int[] mergeSort(int[] a) {
////		System.out.println(Arrays.toString(a));
//		if (a.length <= 1) {
//			return a;
//		} else {
//			int[] f = new int[(a.length+1)/2];
//			int[] b = new int[a.length - f.length];
//
//			System.arraycopy(a, 0, f, 0, f.length);
//			System.arraycopy(a, f.length, b, 0, b.length);
//
////			System.out.println(Arrays.toString(f) + ", " + Arrays.toString(b));
//			return merge(mergeSort(f), mergeSort(b));
//		}
//	}
//
//	private static int[] merge(int[] a, int[] b) {
//		System.out.println(Arrays.toString(a) + ", " + Arrays.toString(b));
//		int[] r = new int[a.length + b.length];
//		int j = 0, k = 0;
//
//		for (int i = 0; i < r.length; i++) {
//			System.out.println("a[j]: " + a[j] + ", b[k]: " + b[k]);
//			System.out.println(a.length + ", " + b.length);
//			System.out.println("i: " + i + ", j: " + j + ", k: " + k);
//			if (j < a.length && k < b.length) {
//				if (a[j] < b[k]) {
//					r[i] = a[j++];
//				} else {
//					r[i] = b[k++];
//				}
//			} else if (j >= a.length) {
//				r[i] = b[k++];
//			} else if (k >= b.length) {
//				r[i] = a[j++];
//			}
//		}
//		return r;
//	}
}