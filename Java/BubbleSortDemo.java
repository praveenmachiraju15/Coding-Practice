class BubbleSortDemo {

	private static int BubbleSort(int array[]) {
		int temp;
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 1; j <= array.length - 1; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

		return 0;
	}

	public static void main(String[] args) {

		int array[] = { 6, 1, 5, 2, 4, 3 };

		BubbleSort(array);
		for (int elem : array)
			System.out.println(elem);

	}

}