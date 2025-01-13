//--------------------------------------------------------------------------------------------------
//File Name:        InputScreen.java
//Associated File:
//Contains:
//  Constructors:	Default:
//  Access:
//   Get -
//   Set -
//   Print -
//
// Other Methods -
//--------------------------------------------------------------------------------------------------

package views;

//import the Scanner for user input
import java.util.Scanner;

public class InputScreen
{
    // private functions
    private Scanner scanner;

    // constructor for class
    public InputScreen()
    {
        // create a new scanner
        scanner = new Scanner(System.in);
    }

    // public functions for the user to input their information
    public String getUserName()
    {
        System.out.print("Enter username: ");
        return scanner.nextLine();
    }
    public String getPassword()
    {
        System.out.print("Enter password: ");
        return scanner.nextLine();
    }


    // give a confirmation message that the user's input was received and what it was
    public void showConfirmationMessage(String userName, String password)
    {
        System.out.println("----- Your information: ------" );
        System.out.println("Username: " + userName);
        System.out.println("Your password is: " + password);

    }

    // show user interaction menu showing what they can do in the program
    public void showInteractionMenu()
    {
        System.out.println("------------------------------------");
        System.out.println("1. Add new case ");
        System.out.println("2. Edit case ");
        System.out.println("3. Delete case ");
        System.out.println("4. Exit");
        System.out.println("------------------------------------");
        System.out.println(" ==> ");
    }



}
