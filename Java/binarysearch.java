class binarysearch {

	public int BinarySearch(int a[], int low, int high, int searchValue) {

		int mid = (low + high) / 2;

		if (low > high)
			return -1;
		if (a[mid] == searchValue)
			return mid;
		else if (searchValue < a[mid])
			return BinarySearch(a, low, mid - 1, searchValue);
		else
			return BinarySearch(a, mid + 1, high, searchValue);

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 6, 7, 8, 9, 10 };
		int low = 0, high = a.length - 1, searchValue = 2;

		binarysearch bs = new binarysearch();
		
		System.out.println(bs.BinarySearch(a, low, high, searchValue)+1);

	}

}