//--------------------------------------------------------------------------------------------------
//File Name:        LoginController.java
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

package controllers;

// import the InputScreen for handling login view
import views.InputScreen;
// import Scanner for new user input
import java.util.Objects;
import java.util.Scanner;

public class LoginController
{
    // create a private input screen
    private InputScreen inputScreen;

    // Constructor for the LoginController that takes in an InputScreen
    public LoginController(InputScreen inputScreen)
    {
        this.inputScreen = inputScreen;
    }

    // login logic where user inputs their username and password
    public void login()
    {
        // get the user's username and password
        String username = inputScreen.getUserName();
        String password = inputScreen.getPassword();

        // give confirmation username and password
        showConfirmation(username, password);

    }

    // show confirmation message to the user when they create their username and password
    public void showConfirmation(String userName, String password)
    {
        // show the confirmation message for the user
        inputScreen.showConfirmationMessage(userName, password);

    }

    public void getUserSelection()
    {
        // integer choice for menu options
        String userChoice;

        // boolean flag for user input validity
        boolean validUserInput;

        // new Scanner for user choice
        Scanner scanner;
        scanner = new Scanner(System.in);

        // initialize variables
        validUserInput = false;

        // get user's selection with error checking
        do {
            // get user's menu choice
            userChoice = scanner.nextLine();

            // check user's choice to make sure that it is not empty
            if (!userChoice.isEmpty())
            {
                // check again user's choice, if it has made a correct input
                if (userChoice.equals("1") || userChoice.equals("2") || userChoice.equals("3") || userChoice.equals("4"))
                {
                    // set valid input selection to true
                    validUserInput = true;
                }
                else
                {
                    // show error message
                    System.out.println("ERROR: Please select valid option. ");
                }
            }
            else
            {
                // show error message
                System.out.println("ERROR: Please select valid option. ");
            }

        } while (!validUserInput);

        // confirmation message
        System.out.println("You have selected ==> " + userChoice);
    }

    public void userMenu()
    {
        // show user menu for program
        inputScreen.showInteractionMenu();

        // get the user's choice selection from menu
        getUserSelection();
    }


}
