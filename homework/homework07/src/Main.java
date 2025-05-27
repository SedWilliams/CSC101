/*
TO-DO:
* rewrite program without the scanner util method
*/

import java.util.Scanner;

public class Main {

    final static double piRatio = 3.1415926;

    public static void main(String[] args) {

        //System.out.println(4.0/3.0);

        Scanner scan = new Scanner(System.in);

        System.out.println("Input radius of sphere to calculate volume... ");
        var inputRadius = scan.nextDouble();
        printSphereVolume(inputRadius);

        System.out.println("Input base of Triangular Prism... ");
        double inputBase = scan.nextDouble();

        System.out.println("Input height of Triangular Prism... ");
        double inputHeight = scan.nextDouble();

        System.out.println("Input length of Triangular Prism... ");
        double inputLength = scan.nextDouble();

        printVolumeOfTrianglePrism(inputBase, inputHeight, inputLength);
    }

    public static void printSphereVolume(double radius) {
        System.out.println("Volume of a sphere with radius " + radius + "is: " + (4.00/3.00)*piRatio*radius*radius*radius);
    }

    public static void printVolumeOfTrianglePrism(double base, double height, double length) {
        System.out.print("The volume of a Triangular Prism with base: " + base + " height: " + height + " length: " + length + " is: " + ((1.00/2.00)*base*height*length));
    }
}