import java.util.Scanner;

public class HousingSelection {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distanceFromSchool = 0;
        //3 options: no financial aid requested, fin. aid requested but not all used, fin. aid requested and all used.
        int studentFinancialAidUse = 0;
        //two age percentiles: college age+1 for gap year, and above
        int age = 0;
        //priority goes to younger years
        int yearInSchool = 0;
        //less eligibility if in bad academic standing
        boolean goodAcademicBehavioralStanding = false;
        //more eligibility if engaged in on campus extracurriculars
        boolean extraCurricularsOnCampus = false;
        //less eligibility if bad housing record
        boolean goodHousingRecord = false;
        boolean studentIsCollegeAge = false;
        int studentHousingEligibility = 0;
        int userAnswer = 1;

        System.out.print("\nWould you like to determine housing eligibility? (0 = no, 1 = yes): ");
        userAnswer = scan.nextInt();

        if(userAnswer == 1) {

            //ask the student relevant questions
            System.out.println("\nOkay, please answer a few questions to determine your eligibility.");
            System.out.print("\nInput your distance from school (0 = in school county, 1 = from out of school county, 2 = from out of state, 3 = international student): ");
            distanceFromSchool = scan.nextInt();
            System.out.print("\nInput your student financial Aid Use: \n0 = no financial aid requested\n1 = financial aid requested but not all used\n2 = financial aid requested and all used.\n");
            studentFinancialAidUse = scan.nextInt();
            System.out.print("\nInput your age: ");
            age = scan.nextInt();
            System.out.print("\nInput what year you are (1 = 1st year, 2 = 2nd year, 3 = 3rd year, 4 = 4th year): ");
            yearInSchool = scan.nextInt();
            System.out.print("\n Do you have good academic/behavioral standing? (0 = No, 1 = Yes): ");
            goodAcademicBehavioralStanding = scan.nextInt() == 1;
            System.out.print("\nDo you engage in extracurriculars on campus? (0 = No, 1 = Yes): ");
            extraCurricularsOnCampus = scan.nextInt() == 1;
            System.out.print("\nDo you have a clean housing record? (0 = No, 1 = Yes): ");
            goodHousingRecord = scan.nextInt() == 1;

            //determine student housing eligibility based off answers to questions
            if(distanceFromSchool == 0) {
                //do nothing
            } else if(distanceFromSchool == 1) {
                studentHousingEligibility += 3;
            } else if(distanceFromSchool == 2) {
                studentHousingEligibility += 6;
            } else if(distanceFromSchool == 3) {
                studentHousingEligibility += 9;
            }
            //student financial situation factor
            if(studentFinancialAidUse == 0) {
                //do nothing
            } else if(studentFinancialAidUse == 1) {
                studentHousingEligibility += 2;
            } else if(studentFinancialAidUse == 2) {
                studentHousingEligibility += 4;
            }
            //student age factor
            if(age <= 24) {
                studentHousingEligibility += 5;
                studentIsCollegeAge = true;
            }
            //student year in school factor
            if(yearInSchool == 1 && studentIsCollegeAge) {
                studentHousingEligibility += 6;
            } else if(yearInSchool == 2 && studentIsCollegeAge) {
                studentHousingEligibility += 4;
            } else if(yearInSchool == 3 && studentIsCollegeAge) {
                studentHousingEligibility += 2;
            } else if(yearInSchool == 4 && studentIsCollegeAge) {
                studentHousingEligibility += 0;
            }
            //student academic standing factor
            if(goodAcademicBehavioralStanding) {
                studentHousingEligibility += 3;
            } else {
                studentHousingEligibility -= 5;
            }
            //student extracurriculars on campus factor
            if(extraCurricularsOnCampus) {
                studentHousingEligibility += 2;
            } else {
                studentHousingEligibility += 0;
            }
            //student housing record factor
            if(goodHousingRecord) {
                studentHousingEligibility += 3;
            } else {
                studentHousingEligibility -= 3;
            }
            System.out.print("\nYour determined score for housing is: " + studentHousingEligibility);
            System.out.println("\nHousing eligibility is an estimate and no guarantee of housing \nis implied. Housing is provided while supplies last with \npriority given to students with higher housing eligibility.");

        } else if(userAnswer == 0) {
            System.out.println("\nProgram terminating...");
        } else {
            System.out.print("\nInvalid input. Please try again.");
        }
        scan.close();
    }
}
