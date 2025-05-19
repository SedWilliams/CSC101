import java.util.Arrays;
import java.util.Scanner;

public class question8 {

	//mplement a Java method named countInts that takes an array of ints. The methods returns an array
	//whose contents stores the frequency count for all ints between 0 and 50. The passed in array does not
	//have ints that are only between 0 and 50
	public static void main(String[] args) {
		int[] test = {1, 5, 10, 20, 20, 20};

		System.out.println(Arrays.deepToString(countInts(test)));

	}

	public static int[][] countInts(int[] nums) {
		int[][] freqCount = new int[50][2];

		for(int i = 1; i < freqCount.length; i++) {
			freqCount[i][0] = i;
		}

		for(int i = 1; i < nums.length; i++) {
			for(int j = 0; j < 1; j++) {
				if(!(nums[i] < 50) && !(nums[i] > 0)) {break;}
				freqCount[nums[i]][1]++;
			}
		}

		return freqCount;
	}

}
