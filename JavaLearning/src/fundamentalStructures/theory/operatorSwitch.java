package fundamentalStructures.theory;

import java.util.Scanner;

/**
 * Switch construction:
 *
 * switch (expression) {
 *     case value1 :
 *          action;
 *          break;      // Optional
 *     case value2 :
 *          action;
 *          break;      // Optional
 *     default :        // Optional and the last one.
 * }
 *
 * Note:
 * 1)   'break' - allow avoid all next cases.
 * 2)   'break' - doesn't needed in default case cause it's automatically breaks out.
 */

public class operatorSwitch {
    public static void main(String[] args) {
        Scanner Decision = new Scanner(System.in);
        System.out.println("Do you want a cup of tea? ");
        String decision = Decision.nextLine();
        switch (decision) {
            case ("Yes") :
                System.out.println("Fine, I'll do one to you.");
                break;
            case ("No") :
                System.out.println("Would you like a cup of coffee then?");
                break;
            default :
                System.out.println("I don't understand what are you talking about.");
        }
    }
}
