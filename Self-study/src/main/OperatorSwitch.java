package main;

public class OperatorSwitch {

	public static void main(String[] args) {
		int a = 3;
		a++;
		System.out.print("a=");
		switch (a) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("2, 3 или 4");
			break;
		default:
		System.out.println("Error");
		}

	}
}