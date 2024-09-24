import java.util.Scanner;
public class SimpleIntrest{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println( );
        System.out.println("Enter Principal(p): ");
        int p = scanner.nextInt();
        System.out.println("Enter Time(t): ");
        int t = scanner.nextInt();
        System.out.print("Enter choice: ");
        char choice =scanner.next().charAt(0);
        float si;
        if (choice == 'y' || choice == 'Y') {
            si =(p*t*12)/100;
        }else{
            si =(p*t*10)/100;
        }
        System.out.println("Simple Intrest: "+ si);
        scanner.close();
    }
}
