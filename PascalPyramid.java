public class PascalPyramid {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows in the pyramid

        for (int i = 0; i < rows; i++) {
            // Print spaces for center alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1;  // Starting number for each row

            // Print the numbers in Pascal's Triangle
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);  // Update number based on Pascal's Triangle formula
            }

            System.out.println();  // Move to the next line
        }
    }
}
