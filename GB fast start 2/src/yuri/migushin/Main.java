package yuri.migushin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Введите операцию:");
	    System.out.println("1. Сумма");
        System.out.println("2. Разность");
        System.out.println("3. Произведение");
        System.out.println("4. Частное");
        System.out.println("5. Дробный остаток от деления");
        Scanner scanner = new Scanner(System.in);
        int operationNumber = scanner.nextInt();
        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        int result = 0;
        if (operationNumber == 1) {
            result = number1 + number2;
        }
        else if (operationNumber == 2) {
            result = number1 - number2;
        }
        else if (operationNumber == 3) {
            result = number1 * number2;
        }
        else if (operationNumber == 4) {
            result = number1 / number2;
        }
        else if (operationNumber == 5) {
            result = number1 % number2;
        }
        System.out.println("Результат вычисления: ");
        System.out.println(result);

    }
}