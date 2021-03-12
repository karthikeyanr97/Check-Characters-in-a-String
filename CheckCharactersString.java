import java.util.Scanner;

public class CheckCharactersString extends UserMainCode {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = scanner.nextLine();
		int res = checkCharacters(s);

		if (res == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");

		scanner.close();
	}
}

class UserMainCode {

	public static int checkCharacters(String s) {

		if (s.charAt(0) == s.charAt(s.length() - 1))
			return 1;
		else
			return -1;
	}
}
