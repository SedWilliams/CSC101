import java.util.Scanner;

public class RestaurantCheckManager {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean programActive;
        double saleTotal = 0;
        double totalTip = 0;
        int numberOfChecks = 0;
        double kitchenLineTotal = 0;

        //program start and intro message
        System.out.println("Welcome to Check Manager");
        System.out.println("--------------------------------");

        //ask for confirmation to enter check loop
        String startProgram;
        System.out.print("Enter checks?...(Y/N): ");
        startProgram = scan.nextLine().trim();
        if(startProgram.equals("Y") || startProgram.equals("y") ) {
            programActive = true;
        } else {
            System.out.println("\nTerminating...");
            programActive = false;
        }

        //main check loop
        while(programActive) {

            double in;
            double currentTotal = 0;
            double currentTipTotal = 0;
            boolean isNonNegative = false;

            //get sale amt and check for negative values
            while(!isNonNegative) {
                System.out.print("\nEnter total sale amount: ");
                in = scan.nextDouble();
                if(in < 0) {
                    System.out.println("\nPlease enter a positive number");
                } else {
                    currentTotal += in;
                    isNonNegative = true;
                }
            }

            //get tip amt and check for negative values
            isNonNegative = false;
            while(!isNonNegative) {
                System.out.print("Enter total tip amount: ");
                in = scan.nextDouble();
                if(in < 0) {
                    System.out.println("\nPlease enter a positive number");
                } else {
                    currentTotal += in;
                    currentTipTotal += in;
                    isNonNegative = true;
                }
            }

           //check for amount sent on the kitchen tip line
            isNonNegative = false;
            while(!isNonNegative) {
                System.out.print("Enter amount of total tip sent to the kitchen: ");
                in = scan.nextDouble();
                if(in < 0) {
                    System.out.println("\nPlease enter a positive number");
                } else {
                    kitchenLineTotal += in;
                    isNonNegative = true;
                }
            }


            //get total amt and check for negative values
            //calculate global total sale amount, total tip amount, and update number of checks
            saleTotal += currentTotal;
            totalTip += currentTipTotal;
            numberOfChecks += 1;

            //display total sale amount to match assignments output format
            System.out.println("Customer total: " + currentTotal);
            System.out.println("\nCheck count: " + numberOfChecks);
            System.out.println("Total sale so far: " + saleTotal);
            System.out.println("Total pooled tip so far: " + totalTip);
            System.out.println("Total pooled tips for kitchen: " + kitchenLineTotal);

            //check if more checks needed
            String terminate;
            scan.nextLine();
            System.out.print("\nDo you want to add more checks? (Y/N): ");
            terminate = scan.nextLine().trim();
            if(terminate.equals("N") || terminate.equals("n") ) {
                programActive = false;
            }

        }

        //tip distribution algorithm
        double serverCut = totalTip * 0.60;
        double kitchenCut = (totalTip * 0.10) + kitchenLineTotal;
        double chefCut = kitchenCut * 0.50;
        double sousChefCut = kitchenCut * 0.30;
        double kitchenAidCut = kitchenCut * 0.20;
        double busserCut = totalTip * 0.10;
        double hostessCut = totalTip * 0.20;

        System.out.println("Total Tips");
        System.out.println("-------------");
        System.out.println("If uneven value then round down and give leftover to restaurant.");

        System.out.print("\nTotal tip for servers: " + serverCut);
        System.out.print("\nTotal tip for chef: " + chefCut);
        System.out.print("\nTotal tip for sous chef: " + sousChefCut);
        System.out.print("\nTotal tip for kitchen aid: " + kitchenAidCut);
        System.out.print("\nTotal tip for busser: " + busserCut);
        System.out.print("\nTotal tip for hostess: " + hostessCut);

    }

}
