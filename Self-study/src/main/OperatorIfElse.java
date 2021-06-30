package main;

public class OperatorIfElse {

	public static void main(String[] args) {
		
		int a = 1, b = 7;
		a /= b;
		System.out.println("*Вычисления целочисленного калькулятора*");
		System.out.println("Получены два числа.");
		if (b != 0) {
			System.out.println("Знаменатель не равен нулю.");
			if ((a % b) == 0) System.out.println("Деление без остатка. Деление возможно.");
			else System.out.println("Деление с остатком. Деление невозможно.");
		}
		else System.out.println("Нельзя делить на ноль. Деление невозможно.");
		
		/* Аналог оператора "while" 
		int i = 2;
		if (i == 1) { // аналог "case 1"
			System.out.println("Исход 1");
		} else if (i == 2) { // аналог "case 2"
			System.out.println("Исход 2, промежуточный");
		} else if (i == 3) { // аналог "case 3"
			System.out.println("Исход 3, промежуточный");
		} else if (i == 4) { // аналог "case 4"
			System.out.println("Исход 4, промежуточный");
		} else { // аналог "case 5"
			System.out.println("Непредусмотренный исход");
		}
		*/
	}
	
}