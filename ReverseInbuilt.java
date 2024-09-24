import java.util.Scanner;
public class ReverseInbuilt{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String input=scanner.nextLine();
        String reversed=new StringBuilder(input).reverse().toString();
        System.out.print("Reversed Word: "+reversed);
        scanner.close();
    }
}