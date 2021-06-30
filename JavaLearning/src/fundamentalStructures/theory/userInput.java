package fundamentalStructures.theory;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        /*
        While Java provides many different methods for getting user input,
        the Scanner object is the most common, and perhaps the easiest to implement.
        Import the Scanner class to use the Scanner object:
            import java.util.Scanner;
        To use the Scanner class, create an instance of the class:
            Scanner myVar = new Scanner(System.in);
        Table of methods:
            Byte - nextByte()
            Short - nextShort()
            Int - nextInt()
            Long - nextLong()
            Float - nextFloat()
            Double - nextDouble()
            Boolean - nextBoolean()
            Complete line - nextLine()
            Word - next()
         */
        // Byte - nextByte()
        Scanner inputB = new Scanner(System.in);
        byte b;
        System.out.print("Enter Byte: ");
        b = inputB.nextByte();
        System.out.println("Entered Byte: " + b);

        // Short - nextShort()
        Scanner inputS = new Scanner(System.in);
        short s;
        System.out.print("Enter Short: ");
        s = inputS.nextShort();
        System.out.println("Entered Short: " + s);

        // Int - nextInt()
        Scanner inputI = new Scanner(System.in);
        int i;
        System.out.println("Enter Integer: ");
        i = inputI.nextInt();
        System.out.println("Enetered Integer: " + i);

        // Long - nextLong()
        Scanner inputL = new Scanner(System.in);
        long l;
        System.out.print("Enter Long: ");
        l = inputL.nextLong();
        System.out.println("Entered Long: " + l);

        // Float - nextFloat()
        Scanner inputF = new Scanner(System.in);
        System.out.println("Enter Float: ");
        float f = inputF.nextFloat();
        System.out.println("Entered Float: " + f);

        // Double - nextDouble()
        Scanner inputD = new Scanner(System.in);
        System.out.println("Enter Double: ");
        double d = inputD.nextDouble();
        System.out.println("Entered Double: " + d);

        // Boolean - nextBoolean()
        Scanner inputBool = new Scanner(System.in);
        System.out.println("Enter Boolean: ");
        boolean bool = inputBool.nextBoolean();
        System.out.println("Entered Boolean: " + bool);

        // Complete line - nextLine()
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter Line: ");
        String line = inputLine.nextLine();
        System.out.println("Entered Line: " + line);

        // Word - next()
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String word = inputWord.next();
        System.out.println("Entered Word: " + word);
    }
}
