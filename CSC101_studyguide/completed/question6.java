import java.util.Arrays;

public class question6 {

	public static void main(String[] args) {
		int[] testCaseOne = {1, 2, 3, 4};

		System.out.println(Arrays.toString(testCaseOne));

		reverse(testCaseOne);

		System.out.println(Arrays.toString(testCaseOne));

	}

	public static void reverse(int[] arr) {
		int[] temp = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			temp[arr.length - i - 1] = arr[i];
		}

		for(int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}
}
