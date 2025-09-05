/*
Objective:
To familiarize you with basic structure of a Java program, producing console output, and creating simple GUI dialogs
using JOptionPane.

Tasks:
1.	Java Basics:
o	Write a simple Java program that:
	Creates a class named FirstProgram.
	Prints "Hello, Java!" to the console.
	Add a single-line comment explaining what the System.out.println statement does.
o	Modify your program to print two additional lines of text introducing yourself and your favorite programming language.

2.	Using JOptionPane:
o	Modify/Update your program to also display a GUI dialog box using JOptionPane that:
	Shows a message dialog box with the text "Welcome to Java Programming!" when the program starts.

3.	Gather User Input:
o	Modify/Update your program to ask for the user’s name, then display a personalized greeting. For example,
    if the user enters "John", the program should display: "Hello, John! Welcome to Java Programming!"

 */
import javax.swing.JOptionPane;

public class HW1
{
    public static void main(String[] args)
    {
        // Prints the message to the console
        System.out.println("Hello, Java!");
        System.out.println("Hello my name is Jeremiah");
        System.out.println("My favorite programing language is java");

        JOptionPane.showMessageDialog(null,"Welcome to Java Programming!");

        String name = JOptionPane.showInputDialog("What is your name? ");

        JOptionPane.showMessageDialog(null,"Hello, " + name + "! Welcome to Java Programming!");


    }



}