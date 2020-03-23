package com.JavaHomeWorks.LukasCuba;

import java.util.Scanner;

public class Triangle {


        public static void main (String[] args) {

            Scanner in = new Scanner(System.in);

            // Prompt the user to three sides of a triangle
            System.out.print("Enter three sides for a triangle: ");
            double side1 = in.nextDouble();
            double side2 = in.nextDouble();
            double side3 = in.nextDouble();

            // Compute area if input is valid. Otherwise, display that input is invalid
            System.out.println(isValid(side1, side2, side3) ?
                    "The area of the triangle is " + area(side1, side2, side3) :
                    "Input is invalid");
        }

        /** Method isValid returns true if the sum of any
         /** two sides is greater than the third side. */
        public static boolean isValid(double side1, double side2, double side3) {

            return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
        }

        /** Method area returns the area of the triangle. */
        public static double area(double side1, double side2, double side3) {

            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }
