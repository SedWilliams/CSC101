public class question9 {

	public static void main(String[] args) {

	}

	public static boolean isSame(int[] arr1, int[] arr2) {

		boolean same = true;

		if(arr1.length != arr2.length){same = false;}

		do {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					same = false;
					break;
				}
			}
		} while(same);

		return same;
	}
}
