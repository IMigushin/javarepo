package fundamentalStructures.theory;

public class dataTypes {
    public static void main(String[] args) {
        System.out.println("DATA TYPES");
        System.out.println("Primitive type: ");
        byte b = 127; // Byte
        short s = 327_67; // Short
        int i = 2_147_483_647; // integer
        long l = 9_223_372_036_854_775_807L; // Long
        char c = 48235; // Char
        boolean bool = false; // Boolean
        float f = 23.5F; // Float
        double d = 23.235_25; // Double
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("All primitive types storage in the stack.");
        System.out.println("Composite type:");
        String str = "Simple string text";
        System.out.println("String: " + str);
        System.out.println("All composite types storage in the heap by reference.");
        System.out.println("Object type");
        String otStr = "23";
        int otNum = Integer.parseInt(otStr);
        System.out.println("Conversion '23' from string to int: " + otNum);
        System.out.println("Object type use where primitive type is unavailable.");
    }
}
