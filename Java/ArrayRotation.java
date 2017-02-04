class ArrayRotation {

	public static int rotateArray(int array[]) {

		int temp = array[0];
		System.out.println("TEmp" + temp);

		for (int i = 0; i <= array.length-2; i++) {

			array[i] = array[i + 1];
		}
		array[array.length - 1] = temp;
		System.out.println("Last element" + array[array.length-1]);

		return 0;
	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Array length" + array.length);

		for (int i = 0; i < 6; i++) {
			rotateArray(array);
		}
		System.out.println("The array after rotations:");
		for(int elem: array)
			System.out.print(elem);
	}

}