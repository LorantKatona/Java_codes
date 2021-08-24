import java.util.Scanner;

public class TimeProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time: ");
		String newTime = input.nextLine();

		boolean sentinel = (newTime.equals("exit"));

		TimeTester test = new TimeTester();
		while (!sentinel) {

			if (test.validateTimeFormat(newTime) == true) {
				System.out.println("OK");
				System.out.print("Enter time: ");
				newTime = input.nextLine();
			} else if (newTime.isEmpty()) {
				System.out.println("No input!");
				System.out.print("Enter time: ");
				newTime = input.nextLine();
			} else if (newTime.equals("exit")) {
				sentinel = true;
			} else {
				System.out.println("Not ok");
				System.out.print("Enter time: ");
				newTime = input.nextLine();
			}
		}
	}
}
