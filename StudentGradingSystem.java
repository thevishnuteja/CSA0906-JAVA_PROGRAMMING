import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueGrading;

        do {
            System.out.print("Enter the student's score: ");
            int score = scanner.nextInt();
            char grade;

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Grade: " + grade);

            System.out.print("Do you want to enter another score? (yes/no): ");
            continueGrading = scanner.next();

        } while (continueGrading.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
