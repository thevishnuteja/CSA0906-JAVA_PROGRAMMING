import java.util.*;

public class SortListChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        List<Integer> numbers = new ArrayList<>();
        
        for (String str : scanner.nextLine().split(" ")) {
            numbers.add(Integer.parseInt(str));
        }

        System.out.print("Enter 'asc' for ascending or 'desc' for descending: ");
        if (scanner.nextLine().equalsIgnoreCase("desc")) {
            Collections.sort(numbers, Collections.reverseOrder());
        } else {
            Collections.sort(numbers);
        }

        System.out.println("Sorted list: " + numbers);
        scanner.close();
    }
}
