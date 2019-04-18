package Java_Exceptions;

public class Java_Exceptions_2 {

	public static void main(String[] args) {

		try {

			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[1]);

		} catch (Exception e) {

			System.out.println("Something went wrong.");

		} finally {

			System.out.println("The 'try catch' is finished.");

		}

	}
}