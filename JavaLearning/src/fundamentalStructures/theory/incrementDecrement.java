package fundamentalStructures.theory;

public class incrementDecrement {
    public static void main(String[] args) {
        System.out.println("Original value before increment is equal 5.");
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;
        ++a;
        System.out.println("Increment '++x' before output: " + a);
        System.out.println("Increment '++x' while output: " + ++b);
        c++;
        System.out.println("Increment 'x++' while output: " + c);
        System.out.println("Increment 'x++' after output: " + d++);
        System.out.println("Value of previous incrementation 'x++' after output : " + d);
    }
}
