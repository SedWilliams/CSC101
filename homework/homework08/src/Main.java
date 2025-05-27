import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int partyMembers;
        float totalTip;

        System.out.print("Enter umber of party members: ");
        partyMembers = scan.nextInt();

        System.out.print("\nEnter total tip amount: ");
        totalTip = scan.nextFloat();

        System.out.print("\nNumber of party members: " + partyMembers + "\nTotal tip amount: " + totalTip + "\nTip per member: " + (totalTip / (float)partyMembers));
    }
}