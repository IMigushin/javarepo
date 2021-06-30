package javastudy.corelevel;

import java.util.Scanner;

public class JavaCore {

	public static void main(String[] args) {

		System.out.println("JAVA CORE LEARNING");
		System.out.println("Program allow check practice");

		// Practice task list
		System.out.println("Select practice task by entering it's code:");
		System.out.println("1 - HelloWorld and vars refactoring.");
		System.out.println("2 - Integer variables.");
		System.out.println("3 - Arithmetical operations with integer variables.");
		System.out.println("4 - Arithmetical operations with floating-point variables.");
		System.out.println("5 - Logic variables.");
		System.out.println("0 - Terminate program.");

		// Practice task selection cycle
		int practiceTaskCode = 0;
		do {
			System.out.print("Enter next practice task code or \"0\" to exit from program: ");
			Scanner scanner = new Scanner(System.in);
			practiceTaskCode = scanner.nextInt();

			switch (practiceTaskCode) {
			case (0):
				System.out.println("The program has terminated.");
				break;
				
			case (1):
				System.out.println("Task 1 - HelloWorld and vars refactoring.");
				String helloworld = "HelloWorld!";
				/*
				 * Select variable name, click right mouse button, select "refactor" and then:
				 * A) choose "rename" to apply changes to whole code B) choose
				 * "extract local variable" to do same thing. Opposite option is "inline"
				 */
				System.out.println(helloworld);
				break;

			case (2):
				System.out.println("Task 2 - Integer variables.");
				System.out.print("Program return value of stored integer variable: ");
				int integerVariable = 42;
				System.out.println("\"" + integerVariable + "\".");
				break;

			case (3):
				System.out.println("Task 3 - Arithmetical operations with integer variables.");
				System.out.println("Program return result of multiplication for stored integer variables.");
				int task3VarA = 6;
				int task3VarB = 7;
				int task3Answer = task3VarA * task3VarB;
				System.out.println("Multiplication of stored integer variables i=\"" + task3VarA + "\" and j=\""
						+ task3VarB + "\" is i*j=\"" + task3Answer + "\".");
				break;

			case (4):
				System.out.println("Task 4 - Arithmetical operations with floating-point variables.");
				// option 4.1
				int task4VarA = 5;
				int task4VarB = 3;
				int task4Answer1 = task4VarA / task4VarB;
				System.out.println("1) A/B where A=\"" + task4VarA + "\", B=\"" + task4VarB + "\" both integer: \""
						+ task4Answer1 + "\".");
				// option 4.2
				float task4Answer2 = (float) task4VarA / (float) task4VarB;
				System.out.println("2) A/B where A=\"" + (float) task4VarA + "\", B=\"" + (float) task4VarB
						+ "\" both conversed from integer to float: \"" + task4Answer2 + "\".");
				// option 4.3
				float task4VarC = 5;
				float task4VarD = 3;
				float task4Answer3 = task4VarC / task4VarD;
				System.out.println("2) A/B where A=\"" + task4VarC + "\", B=\"" + task4VarD + "\" both float: \""
						+ task4Answer3 + "\".");
				break;

			case (5):
				// option 5.1
				System.out.println("Task 5 - Logic variables.");
				boolean task5Var1;
				float task5Var2 = 2;
				if (task5Var2 > 3) {
					task5Var1 = true;
				} else {
					task5Var1 = false;
				}
				System.out.println("Calculated value of boolean variable is: \"" + task5Var1 + "\".");
				// option 5.2
				boolean task5Var3 = task5Var2 > 1 ? true : false;
				System.out.println("Calculated value of boolean variable by ternary operation is: \"" + task5Var1 + "\".");
				break;

			default:
				System.out.println("Error: practice task base doesn't see reference practice task code.");
				break;
			}
		} while (practiceTaskCode != 0);

	}

}
