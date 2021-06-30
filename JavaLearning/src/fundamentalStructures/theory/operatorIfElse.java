package fundamentalStructures.theory;

import java.util.Scanner;

/**
 * If-Else construction have 3 options:
 *
 * 1)   if (condition) {action}
 *
 *      if (condition) {
 *          action
 *      } else {
 *          action
 *      }
 *
 * 3)   if (condition) {
 *          action
 *      } else if (condition) {
 *          action
 *      } else {
 *          action
 *      }
 */

public class operatorIfElse {
    public static void main(String[] args) {
        Scanner Var = new Scanner(System.in);
        System.out.println("Enter your number");
        int var = Var.nextInt();
        if (var > 0) {
            System.out.println("Entered number is positive.");
        } else if (var == 0) {
            System.out.println("Entered number is equal to 0.");
        } else {
            System.out.println("Entered number is negative.");
        }
    }
}
