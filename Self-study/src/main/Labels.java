package main;

public class Labels {

	public static void main(String[] args) {
Lab3l_:		for (int j = 0; j < 8; j++) {
				System.out.print("j=" + j + ":	 ");
				for (int i = 0; i < 8; i++) {
					if ((i == 4) & (j == 1)) break Lab3l_;
					System.out.print("i = " + i + ", ");
				}
				System.out.println();
			}
	}

}