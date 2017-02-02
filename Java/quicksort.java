class quicksort {

	public int Partition(int[] a, int startIndex, int endIndex) {
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

	public void QuickSort(int[] a, int startIndex, int endIndex) {
		if (startIndex < endIndex) {

			int q = Partition(a, startIndex, endIndex);

			QuickSort(a, startIndex, q - 1);
			QuickSort(a, q + 1, endIndex);

		}
	}

	public static void main(String[] args) {

		int[] a = { 5, 1, 4, 2, 3, 0, 0, 3, 4, 6, 7, 8, 12, 2, 3, 6, 7, 8, 9, 0, 3, 6, 8, 7, 6, 50 };
		int startIndex = 0, endIndex = a.length - 1;

		quicksort qs = new quicksort();

		qs.QuickSort(a, startIndex, endIndex);

		for (int k = 0; k <= a.length - 1; k++) {
			System.out.println(a[k]);
		}
	}
}