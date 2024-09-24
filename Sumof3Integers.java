import java.util.Scanner;

public class Sumof3Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println(sum);

        scanner.close();
    }
}
