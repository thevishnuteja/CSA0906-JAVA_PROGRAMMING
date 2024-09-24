import java.util.Scanner;

public class R192224069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int count = scanner.nextInt(); 
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int primeCount = 0;
        int compCount = 0;
        for (int i = 0; i < count; i++) {
            if (isPrime(numbers[i])) {
                primeCount++;
            } else {
                if (numbers[i] > 1) {
                    compCount++;
                }
            }
        }
        System.out.println("Prime Count: " + primeCount);
        System.out.println("Composite Count: " + compCount);
    }
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
