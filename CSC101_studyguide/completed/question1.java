public class question1 {

    //Write a Java program that sums of all the even numbers between 0 and 150. Please print the sum to
    //the console after the loop.
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i<150; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}
