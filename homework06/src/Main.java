public class Main {
    public static void main(String[] args) {

        double circleCircumferenceTemp = circleCircumference(4.50);
        double trianglePerimeterTemp = trianglePerimeter(3.43, 1.7, 3.0);

        System.out.println("The circumference of a circle of radius 4.50 is: " + circleCircumferenceTemp);
        System.out.println("The perimeter of a triangle with sides 3.42 1.7 3.0 is: " + trianglePerimeterTemp);
    }

    public static double circleCircumference(double radius) {
        return 2 * 3.1415926 * radius;
    }

    public static double trianglePerimeter(double sideOne, double sideTwo, double sideThree) {
        return sideOne + sideTwo + sideThree;
    }

}