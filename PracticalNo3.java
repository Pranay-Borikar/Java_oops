/*

Alisha is assigned with the task to design a code for finding out the volume of cube, the
volume of cylinder, the volume of Box using method overloading concept. Can you
Help alisha to achieved the task

Aim:- Practical No.3
Author:- Pranay Borikar
Version:- 3.0
Date:- 13 feb 2024

*/
class Volume
{
    public Double calculateVolume(Double sideLength) 
    {
        return sideLength * sideLength * sideLength;
    }

    public Double calculateVolume(Double radius, Double height) 
    {
        return Math.PI * radius * radius * height;
    }

    public Double calculateVolume(Double length, Double width, Double height) 
    {
        return length * width * height;
    }
}
public class PracticalNo3
{
    public static void main(String[] args) 
    {
        Volume Volume = new Volume();

        Double cubeVolume = Volume.calculateVolume(5.0);
        System.out.println("Volume of cube with side length 5:----> " + cubeVolume);

        Double cylinderVolume = Volume.calculateVolume(3.0, 5.0);
        System.out.println("Volume of cylinder with radius 3 and height 5:----> " + cylinderVolume);

        Double boxVolume = Volume.calculateVolume(4.0, 6.0, 8.0);
        System.out.println("Volume of box with length 4, width 6, and height 8:----> " + boxVolume);
    }
}