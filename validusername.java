import java.util.Scanner;
public class validusername{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Username: ");
        String s1=scanner.nextLine();
        System.out.print("Re-Enter Username: ");
        String s2=scanner.nextLine();
        if(s1.equals(s2)){
            System.out.println(s1+" is a Valid Username");
        }else{
            System.out.println(s1+" is not Valid Username");
        }
        scanner.close();
    }
}
