//--------------------------------------------------------------------------------------------------
//File Name:        UserView.java
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

// import the user's model
import models.User;

public class UserView
{
    // show user's information
    public void showUserInformation(User user)
    {
        // check to make sure there is information in user
        if (user != null)
        {
            // output user info
            System.out.println("=======================");
            System.out.println("User information");

            // output user's name
            System.out.println(user.getName());
            System.out.println(user.getEmail());
            System.out.println(user.getCityAddress());
            System.out.println(user.getStateAddress());
            System.out.println(user.getZipCode());
            System.out.println(user.getPhoneNumber());
            System.out.println(user.getEmail());
            System.out.println("=======================");

        }
        // if the user is empty, there is no information to show
        else
        {
            // show error message
            System.out.println("No user information");
        }
    }
}
