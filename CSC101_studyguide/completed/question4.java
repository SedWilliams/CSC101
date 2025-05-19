public class question4 {

    static int[] testCaseOne = {0, 4, 10, 55};

    //Write a method named findMax that takes in a single dimensional array of ints and returns the maximum
    //value in that array.
    public static void main(String[] args) {
        int max = findMax(testCaseOne);

        System.out.println(max);
    }

    public static int findMax(int[] nums) {
        int maxValue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }

        return maxValue;
    }
}
