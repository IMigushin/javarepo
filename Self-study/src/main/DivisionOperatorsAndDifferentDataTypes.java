package main;

public class DivisionOperatorsAndDifferentDataTypes {

	public static void main(String[] args) {
		int aInt = 3, bInt = 2;
		float aFloat = 0.3f, bFloat = 0.2f;
		double aDouble = 0.3d, bDouble = 0.2d;
		System.out.println("Integer: " + aInt + "; " + bInt);
		System.out.println("Float: " + aFloat + "; " + bFloat);
		System.out.println("Double: " + aDouble + "; " + bDouble);
		System.out.println("-----------------------------------------");
		System.out.println("Integer /-operator : " + aInt / bInt);
		System.out.println("Integer %-operator : " + aInt % bInt);
		System.out.println();
		System.out.println("Float /-operator : " + aFloat / bFloat);
		System.out.println("Float %-operator : " + aFloat % bFloat);
		System.out.println();
		System.out.println("Double /-operator : " + aDouble / bDouble);
		System.out.println("Double %-operator : " + aDouble % bDouble);
	}

}
