import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote. You need to wait " + yearsLeft + " more years.");
        }

        scanner.close();
    }
}
