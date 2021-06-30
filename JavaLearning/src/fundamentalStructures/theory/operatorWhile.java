package fundamentalStructures.theory;

/**
 * While construction
 *
 * while (condition) {
 *     action
 * }
 */

public class operatorWhile {
    public static void main(String[] args) {
        System.out.println("How many times program enter into 'while' operator: from x='0' to '3'?");
        int x = 0;
        while (x < 3) {
            System.out.print("x = " + x + "; enter 'while' - success; x++ = ");
            x++;
            System.out.println(x);
        }
        System.out.print("x = " + x + "; enter 'while' - failed;  x   = " + x);
    }
}
