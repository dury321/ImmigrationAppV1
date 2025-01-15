//--------------------------------------------------------------------------------------------------
//File Name:        UserController.java
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

// import scanner for input
import java.util.Scanner;

// import user data class
import models.User;

public class UserController
{
    private User userProfile;

    // input User information
    public void inputUserInformation()
    {
        // scanner for setting new information
        Scanner scanner = new Scanner(System.in);

        // pretty print for new user input
        System.out.println("-------------------------");
        System.out.println("NEW USER PROFILE");

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Street: ");
        String streetAddress = scanner.nextLine();

        System.out.println("Enter City: ");
        String city = scanner.nextLine();

        System.out.println("Enter State: ");
        String state = scanner.nextLine();

        System.out.println("Enter Zip Code: ");
        String zipCode = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        // create new User profile based on given information
        userProfile = new User(name, streetAddress, city, state, zipCode, phoneNumber, email);


    }




}
