/*
 * A program that sorts an Array using Quick Sort and searches for a number using Binary Search
 * */
class QuickBinarySearch {

	public int Partition(int[] a, int startIndex, int endIndex) { // partition for Quick Sort 
		int x = a[endIndex];
		int i = startIndex - 1;

		for (int j = startIndex; j <= endIndex - 1; j++) {
			if (a[j] <= x) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}

		int temp = a[i + 1];

		a[i + 1] = a[endIndex];
		a[endIndex] = temp;

		return i + 1;
	}

	public void QuickSort(int[] a, int startIndex, int endIndex) { //Actual quick sort method
		if (startIndex < endIndex) {

			int q = Partition(a, startIndex, endIndex);

			QuickSort(a, startIndex, q - 1);
			QuickSort(a, q + 1, endIndex);

		}
	}

	public int BinarySearch(int a[], int low, int high, int searchValue) { //Binary Search Method

		int mid = (low + high) / 2;

		if (low > high) {
			System.out.println("Number doesnt exist");
			return -1;
		}
		if (a[mid] == searchValue){
		System.out.println("The Given number is at Position: "+ mid);
			return mid;
		}
		else if (searchValue < a[mid])
			return BinarySearch(a, low, mid - 1, searchValue);
		else
			return BinarySearch(a, mid + 1, high, searchValue);

	}

	public static void main(String[] args) {

		// int[] a = { 5, 1, 4, 2, 3, 0, 0, 3, 4, 6, 7, 8, 12, 2, 3, 6, 7, 8, 9,
		// 0, 3, 6, 8, 7, 6, 50 };

		int[] a = { 6, 8, 11, 12, 0, 1, 7, 9, 4, 13, 17 }; // Array used for sorting and later searching
		int startIndex = 0, endIndex = a.length - 1, searchValue = 99;

		QuickBinarySearch qbs = new QuickBinarySearch(); //instantiating the class using 'qbs'

		qbs.QuickSort(a, startIndex, endIndex); //calling Quick Sort on the array and the array boundaries...
		System.out.println("The Given array in Sorted Order: ");
		for (int k = 0; k <= a.length - 1; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println("");
		qbs.BinarySearch(a, startIndex, endIndex, searchValue); //calling Binary Search with SORTED array and with Array Boundaries
	//	System.out.println("Number " + searchValue );
	}
}