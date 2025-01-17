// import the User class
import models.User;
//import the InputScreen class
import views.InputScreen;
//import the LoginController class
import controllers.LoginController;
//import Scanner for user input
import java.util.Scanner;



public class Main {
    public static void main(String[] args)
    {
        // new Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // new InputScreen to handle views of login
        InputScreen inputScreen = new InputScreen();
        // new LogicController to handle login logic
        LoginController loginController = new LoginController(inputScreen);

        // new user menu input
        // TODO: Abstract this away so that we initialize this menu selection elsewhere
        int menuSelection;

        // let user create username/password
        loginController.login();

        // prompt user with menu
        loginController.userMenu();







    }
}