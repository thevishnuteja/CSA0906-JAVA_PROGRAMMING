import java.util.Arrays;

public class SortCharacters {
    public static void main(String[] args) {
        String word = "computer";
        char[] characters = word.toCharArray();
        
        Arrays.sort(characters);
        
        String sortedWord = new String(characters);
        
        System.out.println("Alphabetical order: " + sortedWord);
    }
}  