package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write a program to calculate the circumference of a circle
        // the formula for the circumference of a circle is 2 * PI * r

        //Initializing our scanner class
 //       Scanner scanner = new Scanner(System.in);

        //Promp the user to enter the radius of the circle
  //      System.out.print("Enter the radius of the circle: ");

        // Initialize our variables
 //       float pi = (float)Math.PI;
//        float radius = scanner.nextFloat();

 //       float circumference = 2 * pi * radius;

        // output the result
 //       System.out.print("The circumference of the circle is " + circumference);

        //Classwork
        //Write an application that calculates the body mass index of a person
        // Two values will be collected from the user:
        // 1. weight in kg(double)
        // 2. height in m^2(double)
        // the formula for BMI is weight/(height^2)
        // if the resulting bmi not between the range of 18.5 - 24.9, then you should see the output
        //"BMI not optimal" else "Bmi optimal"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight in kg: ");

        double weight = scanner.nextDouble();
        System.out.println("Input height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight/(height * height);
        System.out.println("BMI value is " + bmi);

        if (bmi < 18.9 || bmi > 24.9) {
            System.out.println("BMI not optimal");
        } else {
            System.out.println("BMI is optimal");
        }


    }
}
