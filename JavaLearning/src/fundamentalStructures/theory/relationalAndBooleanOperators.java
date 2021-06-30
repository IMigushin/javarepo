package fundamentalStructures.theory;

/**
 * Logical operators divide to 2 groups: for boolean and for integer types. This group for boolean.
 * Relational and boolean operators are
 * == - comparison
 * != - not
 * &  - and
 * |  - or
 * && - and, that stops evaluating as soon as get answer for whole exception
 * || - or, that stops evaluating as soon as get answer for whole exception
 */

public class relationalAndBooleanOperators {
    public static void main(String[] args) {
        System.out.println("Operator '!='");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
        System.out.println("Operator '&':");
        System.out.println("true & true = " + (true & true));
        System.out.println("true & false = " + (true & false));
        System.out.println("false & false = " + (false & false));
        System.out.println("Operator '|':");
        System.out.println("true | true = " + (true | true));
        System.out.println("true | false = " + (true | false));
        System.out.println("false | false = " + (false | false));
        System.out.println("Operator '==':");
        System.out.println("(3 == 3) = " + (3 == 3));
        System.out.println("(3 == 7) = " + (3 == 7));
        System.out.println("Double operators '&&' and '||' mean compiler stops evaluation as soon as get unchangeable result:");
        System.out.println("'&&': 'x != 0 && 1/x' will never return 'true' if first return 'false'.");
        System.out.println("'||': value of 'expression1 || expression2' is automatically true if the first expression is 'true' without evaluation the second expression.");
    }
}
