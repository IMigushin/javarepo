package fundamentalStructures.theory;

public class commenting {
    public static void main(String[] args) {
        System.out.println("Java have several types of comments.");
        System.out.println("Java does NOT support comment type mixing.");
        System.out.println("Single-line comment is available by using double slash '//' before comment."); // Single line comment (comment after code)
        // Other example for single-line comment
        System.out.println("// Single-line comment example");
        System.out.println("Multi-line comment is available by using Slash+Asterisk '/*'...'*/' on the start and end of multi-line comment.");
        /* Multi-line comment.
        Another line for example of multi-line comment.
        */
        System.out.println("/* Multi-line comment example's start");
        System.out.println("Multi-line comment example's body");
        System.out.println("*/ Multi-line comment example's end");
        System.out.println("Multi-line comment is also available by using '/**...('*' at the beginning of each line)...*/' on the start and end of multi-line comment. ");
        /* Multi-line comment.
         * Same as previous
         * Another line for example of multi-line comment.
         */
        System.out.println("/** Documentation comment example's start");
        System.out.println("* Documentation comment example's body");
        System.out.println("*/ Documentation comment example's end");
        System.out.println("Documentation comments is available by using Slash+Asterisk+Asterisk '/**' before comment 'box'.");
        /*
          Javadoc comment
         */
        System.out.println("/*");
        System.out.println("Javadoc comment");
        System.out.println("*/");
    }
}
