/*

Raghav is assigned with the task to develop a code for finding out the perimeter and area
of a circle given a value of radius.He should use Math.PI constant in his program. If
radius is zero or less than zero then print " please enter non zero positive number ". Can
you help raghav for developing the code.

Aim:- Practical No.2
Author:- Pranay Borikar
Version:- 2.0
Date:- 06 feb 2024

*/

import java.util.Scanner;

class PracticalNo2
{
    public static void main(String []argv)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the radius of the circle: ");

        double radius = myObj.nextDouble();  // Read user input
        
        
        if(radius <=0)
        {
            System.out.println("please enter non zero positive number!!");
        }
        else
        {
            double perimeter= 2 * Math.PI* radius;
            double area = Math.PI *radius* radius;
            
            System.out.println("radius: " + radius);
            System.out.println("Perimeter of the circle: " + perimeter);
            System.out.println("Area of the circle: " + area);

        }
    }
}
