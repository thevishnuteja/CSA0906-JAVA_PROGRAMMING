import java.util.Scanner;

public class RectanglebyUserChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character to use: ");
        char character = scanner.next().charAt(0);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        scanner.close();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
