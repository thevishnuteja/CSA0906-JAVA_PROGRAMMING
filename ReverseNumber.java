import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=scanner.nextInt();
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("Reversed Number: "+rev);
        scanner.close();
    }
}