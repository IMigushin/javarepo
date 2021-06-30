package main;

public class OperatorBreak {

	public static void main(String[] args) {
		/*
		for (int j = 0; j <5; j++) {	
			System.out.print(" j = " + j + ";");
			for (int i = 0; i < 5; i++) {
				if (i == 3) {
					break;
				}
				System.out.print(" i = " + i + ",");
			}
			System.out.println();
		}
		*/
	second:	for (int j = 0; j <5; j++) {	
			System.out.print(" j = " + j + ";");
		first:	for (int i = 0; i < 5; i++) {
				if (i == 3) {
					break second;
				}
				System.out.print(" i = " + i + ",");
			}
			System.out.println();
		}
	}

}