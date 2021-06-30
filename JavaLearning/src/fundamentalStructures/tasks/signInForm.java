package fundamentalStructures.tasks;

import java.util.Scanner;

/**
 * Program imitates sign in.
 *         1) Ask login and password.
 *         2) Get login and password.
 *         3) Check login and password.
 *         4) Return result: signed in OR error+repeat.
 *
 *  {@value}    userLogin - true login for check.
 *  {@value}    userPassword - true login for check.
 *  {@value}    login - scanner object to receive login from user.
 *  {@value}    password - scanner object to receive password from user.
 *  {@value}    singInLoop - flag refers to program cycling: '0' - repeat, '1' - exit with success, '-1' - exit with error
 *  {@value}    enteredLogin - login entered by the user.
 *  {@value}    enteredPassword - password entered by the user.
 *  @since      1.0
 */

public class signInForm {
    public static void main(String[] args) {
        String userLogin = "OneAnotherGuy"; // Need make link to DB
        String userPassword = "ca11lvl3Daddy"; // Need make link to DB

        Scanner Login = new Scanner(System.in);
        Scanner Password = new Scanner(System.in);
        boolean singInLoop = false;

        System.out.println("Welcome to Software!");
        do {
            System.out.print("Login: ");
            String enteredLogin = Login.next();
            System.out.print("Password: ");
            String enteredPassword = Password.next();

            System.out.println("Check in progress...");
            if (enteredLogin.equals(userLogin)) {
                if (enteredPassword.equals(userPassword)) {
                    System.out.println("Sign in successful. Thank you for using Software!");
                    singInLoop = false;
                } else {
                    break;
                }
            } else {
                String repeatCommand = "";
                Scanner RepeatCommand = new Scanner(System.in);
                boolean repeatLoop;
                do {
                    System.out.println("Sorry, entered login data is incorrect.");
                    System.out.println("Do you want to repeat sing in? (Y - yes, N - no)");
                    repeatCommand = RepeatCommand.next();
                    if ((repeatCommand.equals("Y")) | (repeatCommand.equals("y"))){
                        singInLoop = true;
                        repeatLoop = false;
                    } else if ((repeatCommand.equals("N")) | (repeatCommand.equals("n"))){
                        singInLoop = false;
                        repeatLoop = false;
                    } else {
                        singInLoop = false;
                        repeatLoop = true;
                        System.out.println("Entered data is incorrect. Write 'Y' to repeat sign in or 'N' to exit from program.");
                    }
                } while (repeatLoop);
            }
        } while (singInLoop);
    }
}
