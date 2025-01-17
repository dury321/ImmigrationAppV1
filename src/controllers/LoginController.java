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
// import the UserViews to show user information
import views.UserView;

// import Scanner for new user input
import java.util.Objects;
import java.util.Scanner;
import controllers.UserController;


public class LoginController
{
    // create a private input screen
    private InputScreen inputScreen;
    // create a persistent user controller
    private UserController userController;

    // Constructor for the LoginController that takes in an InputScreen
    public LoginController(InputScreen inputScreen)
    {
        this.inputScreen = inputScreen;
        this.userController = new UserController();
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

    // get the user's selection for the input menu
    public int getUserSelection()
    {
        // user's selection from menu
        int menuSelection;

        // integer choice for menu options
        String userChoice;

        // boolean flag for user input validity
        boolean validUserInput;

        // new Scanner for user choice
        Scanner scanner;
        scanner = new Scanner(System.in);

        // initialize variables
        validUserInput = false;
        menuSelection = 0;

        // show user menu for program
        inputScreen.showInteractionMenu();

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
                    // switch for the different cases for menu input
                    switch (userChoice)
                    {
                        case "1":
                            menuSelection = 1;
                            break;
                        case "2":
                            menuSelection = 2;
                            break;
                        case "3":
                            menuSelection = 3;
                            break;
                        case "4":
                            menuSelection = 4;
                            break;
                        default:
                            menuSelection = 0;
                            break;
                    }

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

        return menuSelection;
    }

    // handle logic for user menu selections
    public void userMenu()
    {
        // user's menu selection
        int menuSelection;

        // new user for operation of cases/user
        UserController userController = new UserController();

        // keep the user in the loop to put information in, keep track of info, etc.
        do {

            // menu selection variable
            menuSelection = getUserSelection();

            // user wants to create a new profile
            if (menuSelection == 1) {
                // input user's information
                userController.inputUserInformation();
            }
            // user wants to edit their profile, show their information
            else if (menuSelection == 2)
            {
                if (userController.getUserProfile() != null)
                {
                    // pass the userProfile to UserView
                    UserView userView = new UserView();
                    // show user's information by passing the userProfile to UserView
                    userView.showUserInformation(userController.getUserProfile());
                }
                else
                {
                    // if the user profile is null, there is no profile set yet
                    System.out.println("No user profile found.");
                }

            }
            // user wants to delete case
            else if (menuSelection == 3)
            {
                // TODO: Implement case deletion
                System.out.println("Case to be deleted: ");
            }
            // user wants to exit the program
            else
            {
                System.out.println("GOODBYE");
            }

            // stay in loop while the user has not exited the program
        } while (menuSelection != 0);
    }
}
