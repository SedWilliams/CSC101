
import java.util.Scanner;

public class Student {
	
	private String studentID;
	//distance is split into four percentiles: close, out of county, out of state, interna.
	private int distancePercentile;
	//three age percentiles: college age+1 for gap year, middle age, above
	private int age;
	//priority goes to younger years
	private int yearInSchool;
	//less eligibility if in bad academic standing
	private boolean goodAcademicStanding;
	//more eligibility if engaged in on campus extra curriculars
	private boolean extraCurricularsOnCampus;
	//less eligibility if bad housing record
	private boolean goodHousingRecord;
	private boolean studentIsCollegeAge;
	private float studentHousingEligibility;

	public Student() {
		//no constructor	
	}

	public float getStudentHousingEligibility() {
		return studentHousingEligibility*100;
	}

	private void calculateHousingEligibility() {

		final float distanceFromSchoolWeight = 0.40f;
		final float ageWeight = 0.15f;
		final float yearInSchoolWeight = 0.15f;
		final float goodAcademicStandingWeight = 0.05f;
		final float extraCurricularsOnCampusWeight = 0.05f;
		final float goodHousingRecordWeight = 0.20f;

		//student distance from school factor
		if(distancePercentile == 0) {	
			studentHousingEligibility += 0.0f * distanceFromSchoolWeight;
		} else if(distancePercentile == 1) {
			studentHousingEligibility +=  0.50 * distanceFromSchoolWeight;
		} else if(distancePercentile == 2) {
			studentHousingEligibility += 0.60 * distanceFromSchoolWeight;
		} else if(distancePercentile == 3) {
			studentHousingEligibility += 1 * distanceFromSchoolWeight;
		}

		//student age factor
		if(age <= 24) {
			studentHousingEligibility += 1.0f * ageWeight;
			studentIsCollegeAge = true;
		} else {
			studentHousingEligibility += 0.0f * ageWeight;
		}

		//student year in school factor
		if(yearInSchool == 1 && studentIsCollegeAge) {
			studentHousingEligibility += 1.0f * yearInSchoolWeight;
		} else if(yearInSchool == 2 && studentIsCollegeAge) {
			studentHousingEligibility += 0.75f * yearInSchoolWeight;
		} else if(yearInSchool == 3 && studentIsCollegeAge) {
			studentHousingEligibility += 0.50f * yearInSchoolWeight;
		} else if(yearInSchool == 4 && studentIsCollegeAge) {
			studentHousingEligibility += 0.25f * yearInSchoolWeight;
		} else {
			studentHousingEligibility += 0.0f * yearInSchoolWeight;
		}
		
		//student academic standing factor
		if(goodAcademicStanding) {
			studentHousingEligibility += 1.0f * goodAcademicStandingWeight;
		} else {
			studentHousingEligibility += 0.0f * goodAcademicStandingWeight;
		}

		//student extra curriculars on campus factor
		if(extraCurricularsOnCampus) {
			studentHousingEligibility += 1.0f * extraCurricularsOnCampusWeight;
		} else {
			studentHousingEligibility += 0.0f * extraCurricularsOnCampusWeight;
		}

		//student housing record factor
		if(goodHousingRecord) {
			studentHousingEligibility += 1.0f * goodHousingRecordWeight;
		} else {
			studentHousingEligibility += 0.0f * goodHousingRecordWeight;
		}

	}

	//initialize the student variables
	public void setStudentData() {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nInput your student ID: ");
		studentID = scan.nextLine();	

		System.out.println("\nInput your distance from school (0 = in school county, 1 = from out of school county, 2 = from out of state, 3 = international student): ");
		distancePercentile = scan.nextInt();
		
		System.out.println("\nInput your age: ");
		age = scan.nextInt();

		System.out.println("\nInput what year you are (1 = 1st year, 2 = 2nd year, 3 = 3rd year, 4 = 4th year): ");
		yearInSchool = scan.nextInt();

		System.out.println("\n Do you have good academic standing? (0 = No, 1 = Yes): ");
		if(scan.nextInt() == 1) {
			goodAcademicStanding = true;
		} else {
			goodAcademicStanding = false;
		}

		System.out.println("\nDo you engage in extra curriculars on campus? (0 = No, 1 = Yes): ");
		if(scan.nextInt() == 1) {
			extraCurricularsOnCampus = true;
		} else {
			extraCurricularsOnCampus = false;
		}
		
		System.out.println("\nDo you have a clean housing record? (0 = No, 1 = Yes): ");
		if(scan.nextInt() == 1) {
			goodHousingRecord = true;
		} else {
			goodHousingRecord = false;
		}

		calculateHousingEligibility();
	}

}

