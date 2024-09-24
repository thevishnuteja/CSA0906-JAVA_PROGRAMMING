import java.util.Scanner;

public class UsernameCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.next();
        boolean isValid = username.length() >= 5 && username.length() <= 15;

        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println(username + " is a valid username.");
        } else {
            System.out.println(username + " is not a valid username.");
        }

        scanner.close();
    }
}
