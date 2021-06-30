package fundamentalStructures.theory;

/**
 * Logical operators divide to 2 groups: for boolean and for integer types. This group for boolean.
 * & - `and`, same as `*`;
 * | - `or`, same as `+`;
 * ^ - `xor`, same as `-` without negative sing;
 * ~ - `not`, same as `NOT` or (negation).
 */

public class bitwiseOperators {
    public static void main(String[] args) {
        byte a=5;
        byte b=3;
        System.out.println("a>b | a<b = " + (a>b | a<b)); // Don't sure is it boolean or not
        System.out.println("a>b & a<b = " + (a>b & a<b)); // Don't sure is it boolean or not
        System.out.println("a>b ^ a<b = " + (a>b ^ a<b)); // Don't sure is it boolean or not
        System.out.println("~9 = " + ~9 + ". Cause:");
        System.out.println("`9` in decimal system is `1001` in binary system,");
        System.out.println("`NOT` change turn each number to opposite, so `1001` turn into `0110`,");
        System.out.println("'0110` in binary system is `6` in decimal system.");
        System.out.println("~9 = " + ~9 + ". Cause NOT(1001)=0110. `0110` in binary system is `6` in decimal system.");
        System.out.println("9&10 = "+ (9&10) + ". Cause 1001 & 1010 = 1000. `1000` in binary system is `8` in decimal system.");
        System.out.println("9&10 = "+ (9|10) + ". Cause 1001 | 1010 = 1011. `1000` in binary system is `11` in decimal system.");
        System.out.println("9&10 = "+ (9^10) + ". Cause 1001 | 1010 = 0011. `0011` in binary system is `3` in decimal system.");
        System.out.println("& = *");
        System.out.println("| = +");
        System.out.println("^ = -");
        System.out.println("~ = ! (negation)");
    }
}
