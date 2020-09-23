import java.util.Arrays;

public class SortingAlgorithms {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] actual = { 5, 1, 6, 2, 3, 4 };
	    int[] expected = { 1, 2, 3, 4, 5, 6 };
	    int[] result = mergeSort(actual, actual.length);
	    System.out.println(Arrays.equals(expected, result)) ;
	}

	public Object[] bubbleSort() {

		return null;
	}

	public Object[] insertionSort() {

		return null;
	}

	public static int[] mergeSort(int[] toSort, int n) {
	    if (n < 2) {
	        return toSort;
	    }
	    int mid = n / 2;
	    int[] a = new int[mid];
	    int[] b = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        a[i] = toSort[i];
	    }
	    for (int i = mid; i < n; i++) {
	        b[i - mid] = toSort[i];
	    }
	    mergeSort(a, mid);
	    mergeSort(b, n - mid);
	 
	    merge(toSort, a, b, mid, n - mid);
	    return toSort ;
	}
	
	public static void merge (int[] a, int[] l, int[] r, int left, int right) {
	 
	    int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	        }
	        else {
	            a[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	        a[k++] = l[i++];
	    }
	    while (j < right) {
	        a[k++] = r[j++];
	    }
	}
}