import java.util.Scanner;

public class question3 {

    //Write a Java program that reads in positive integers from the user and computes the average of the
    //entered numbers. Your program should stop once the user enters -1 as a value
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        int sum = 0;
        int numCount = 0;

        boolean terminated = false;
        while(!terminated) {
            System.out.print("Enter positive integer: ");
            input = scan.nextInt();

            if(input == -1) {
                terminated = true;
            } else {
                sum += input;
                numCount++;
            }
        }

        System.out.println("The average is: " + sum / numCount);
    }
}
