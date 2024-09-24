import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 5, 12, 10, 17, 13};
        
        Arrays.sort(numbers);
        
        System.out.println("Ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}  