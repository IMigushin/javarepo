package fundamentalStructures.theory;

/**
 * Do-While construction
 *
 * do {
 *     action
 * } while (condition)
 */

public class operatorDoWhile {
    public static void main(String[] args) {
        System.out.println("How many times program enter into 'while' operator: from x='0' to '3'?");
        int x = 0;
        do {
            System.out.print("x = " + x + "; enter 'while' - success; x++ = ");
            x++;
            System.out.println(x);
        } while (x < 3);
        System.out.println("Exit from 'Do-While' construction.");
    }
}
