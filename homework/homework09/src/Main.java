import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static float tipPerMemberCalc(int partyMems, float tipAmount) {
        return tipAmount / partyMems;
    }

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int partyMembers = 0;
       float tipAmount = 0;

       //validation logic for party mem
       try {
           System.out.print("Enter the number of party members (integer): ");
           partyMembers = Integer.parseInt(scan.nextLine());

           //throw error if input is signed or 0
           if(partyMembers < 1 ) {
               throw new InputMismatchException("\nInvalid input, please enter a positive integer...");
           }
       } catch (InputMismatchException e) {
           System.out.print("\nInvalid Input please enter a positive integer...");
       }

        //validation logic for tip amount
        try {
            System.out.print("\nEnter tip amount (float): ");
            tipAmount = Float.parseFloat(scan.nextLine());

            if(tipAmount < 0.01) {
                throw new InputMismatchException("\nInvalid input, please input the amount of the tip...");
            }
        } catch (InputMismatchException e) {
            System.out.print("\nInvalid Input please enter a float...");
        }

        System.out.print("\nNumber of party members: " + partyMembers + "\nTotal tip amount is: " + tipAmount + "\nThe tip amount each person will pay is: " + tipPerMemberCalc(partyMembers, tipAmount));
    }

}