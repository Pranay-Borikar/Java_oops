/* 

Find the method printName. Notice the comment lines showing where you should
put your code. This has a name passed into it with the format “<first name> <last
name>”.You will reformat it to be “<last name>, <first name> and print it out.
Example:
“Bill Joy” becomes “Joy,Bill”
There will always be at least one space between the first and the last name.
There may be
extra spaces between the first and last names and extra spaces at the beginning
and end of
the name passed in. You will have to strip these out if they are there.

Aim:- Practical No.4
Author:- Pranay Borikar
Version:- 4.0
Date:- 20 feb 2024 

*/

public class PracticalNo4
{
    public static void main(String[] argv)
    {
        String fullName ="Bill Joy";
        System.out.println("Full Name----"+ fullName);
        printFullName(fullName);
    }
    
    public static void printFullName(String fullName)
    {
        fullName = fullName.trim();
        String[] name = fullName.split(" ");
        if (name.length >= 2)
        {
            String firstName = name[0];
            String lastName = name[name.length - 1];
            String reformattedName = lastName + "," + firstName;
            System.out.println("Full Name----"+ reformattedName);
        }
        else
        {   
            System.out.println("Format Invalid");
        }
    }
}