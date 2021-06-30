package main;
public class IncrementAndDecrementOperators {
	public static void main(String[] args) {
		int a = 5, prefix = 0, postfix = 0;
		System.out.println("Начальное");
		System.out.println("a = "+ a + "; префикс = " + prefix + "; постфикс = " + postfix + "; a = " + a);
		prefix = ++a;
		System.out.println("После префикса");
		System.out.println("a = " + a + "; префикс = " + prefix + "; постфикс = " + postfix + "; a = " + a);
		a = 5; prefix = 0; postfix = 0;
		System.out.println("--------------------------------------------------");
		System.out.println("Начальное");
		System.out.println("a = "+ a + "; префикс = " + prefix + "; постфикс = " + postfix + "; a = " + a);
		postfix = a++;
		System.out.println("После постфикса");
		System.out.println("a = " + a + "; префикс = " + prefix + "; постфикс = " + postfix + "; a = " + a);
	}
}