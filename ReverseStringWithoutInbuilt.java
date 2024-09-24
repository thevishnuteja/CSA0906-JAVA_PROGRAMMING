import java.util.Scanner;
public class ReverseStringWithoutInbuilt{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name=scanner.nextLine();
        String revers="";
        for(int i=name.length()-1;i>=0;i--){
            revers+=name.charAt(i);
        }
        System.out.println("Reverse String: "+revers);
        scanner.close();
    }
}