package fundamentalStructures.theory;

/**
 * for (initialize internal variable; condition; step) {
 *     action
 * }
 *
 * initialize external variable;
 * for (call external variable (+ value assignment); condition; step) {
 *     action
 * }
 * following using of external variable;
 */

public class operatorFor {
    public static void main(String[] args) {
        System.out.println("How does 'For' construction work in 2 ways.");

        System.out.println("If variable initialized in 'For' condition:");
        for (byte x = 0; x < 3; x++) {
            System.out.print("x = " + x + "; enter 'while' - success; x++ = ");
            System.out.println(x);
        }
        System.out.println("Exit from 'For' construction");
        System.out.println("Summary: variable initialized in 'For' condition can't be used outside of 'For' construction.");

        System.out.println("If variable initialized before 'For' construction:");
        byte y;
        for (y = 0; y < 3; y++) {
            System.out.print("y = " + y + "; enter 'while' - success; y++ = ");
            System.out.println(y);
        }
        System.out.println("Exit from 'For' construction with y=" + y);
        System.out.println("Summary: variable initialized before 'For' condition can be used outside of 'For' construction.");
    }
}