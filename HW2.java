/*
String Manipulation and Basic Math with JOptionPane
Objective: To strengthen your understanding of basic data types, string, and arithmetic
operations in Java, all while using the JOptionPane class for input and output.

Tasks:
1. Gathering User Input:
Create a Java program that asks the user for the following information using
JOptionPane.showInputDialog():
    o Their full name (first and last name in one input box)
    o Their year of birth (as an integer)
    o Their height in centimeters (as a double)

2. Processing the Input:
    Extract and store the first and last names from the full name input using String
    methods (indexOf(), substring()). Google those methods and see how to use them.
    Calculate the user's age assuming the current year is 2025. (For simplicity, assume
    their birthday has already passed this year.)
    Convert the height from centimeters to meters and store it as a double (height in
    meters = height in centimeters / 100).

3. Displaying the Results:
Use JOptionPane.showMessageDialog() to display a message that:
    o Greet the user by their first name.
    o Displays their last name.
    o Shows their calculated age.
    o Displays their height in meters.
 */

import javax.swing.JOptionPane;

public class HW2
{
    public static void main(String[] args)
    {
        // Gathers information from user using GUI
        String name = JOptionPane.showInputDialog("Enter your first and last name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height in cm: "));
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Can you tell me your birth year " +
                "i just want to make sure i got your age right:  "));

        // finds the space between the name
        int spaceIndex = name.indexOf(" ");

        // Finds the first name by taking everything before the first space
        String firstName = name.substring(0, spaceIndex);

        // Finds the last name by taking everything after the first space
        String lastName = name.substring(spaceIndex + 1);

        // Calculate users age and height in meters
        int trueAge = 2025 - birthYear;
       double trueHeight = height / 100;

        // testing my logic
        // System.out.println(trueAge +" "+ trueHeight);
        // System.out.println(firstName + "" + lastName);

        JOptionPane.showMessageDialog(null, "Hello " + firstName +
                "\n Your last name is: " + lastName +
                "\n Your age is: " + trueAge +
                "\n Your height in meters is: " + trueHeight );


    }


}
