import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int userAnswer = 1;

		while(userAnswer == 1) {

			System.out.print("\nWould you like to determine housing eligbility? (1 = yes, 2 = no): ");
			userAnswer = scan.nextInt();

			if(userAnswer == 1) {
				Student student = new Student();
				student.setStudentData();
				System.out.println("\nYour housing eligbility is: " + student.getStudentHousingEligibility() + "%");
				System.out.println("\nHousing eligibility is an estimamte and no guarantee of housing \nis implied. Housing is provided while supplies last with \npriority given to students with higher housing eligibility.");
				System.out.println("\nSee line below to determine housing eligibility again...");
			} else if(userAnswer == 2) {
				System.out.println("\nProgram terminating...");
				break;
			} else {
				System.out.print("\nInvalid input. Please try again.");
			}

		}

		scan.close();

	}
}

