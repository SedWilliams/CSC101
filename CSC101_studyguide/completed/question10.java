public class question10 {
	public static void main(String[] args) {

	}

	public static int[] combineArrays(int[] arr1, int[] arr2) {
		int[] combined = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++){ combined[i] = arr1[i]; }
		for (int i = 0; i < arr2.length; i++){ combined[arr1.length + i] = arr2[i]; }

		return combined;
	}
}
