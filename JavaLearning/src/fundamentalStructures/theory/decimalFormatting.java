package fundamentalStructures.theory;

import java.text.DecimalFormat;

public class decimalFormatting {
    public static void main(String[] args) {
        /*
        Where're several ways to limit output count of digits after dot.
        1) "%.<number of digits>" + "%n" (Examples: %.2; %.3; %.6. P.S.: "%n" using to go to next line cause of printF method usage)
        2) big decimal (import java.text.DecimalFormat)
         */
        System.out.println("Input numbers:");
        System.out.println("17.654447d");
        System.out.println("17.655447d");
        double a = 17.654447d;
        double b = 17.655447d;
        // 1st way:
        System.out.printf("1st way: round up 1 closest digit: %.2f %n", a);
        System.out.printf("1st way: round up 1 closest digit: %.2f %n", b);
        // 2nd way:
        DecimalFormat df32 = new DecimalFormat("###.##");
        System.out.println("2nd way, ###.##: round up 1 closest digit: " + df32.format(a));
        System.out.println("2nd way, ###.##: round up 1 closest digit: " + df32.format(b));
        DecimalFormat df12 = new DecimalFormat("#.##");
        System.out.println("2nd way, #.##: round up 1 closest digit: " + df12.format(a));
        System.out.println("2nd way, #.##: round up 1 closest digit: " + df12.format(b));
    }
}
