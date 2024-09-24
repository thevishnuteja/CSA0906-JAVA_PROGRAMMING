import java.util.Scanner;
public class RightTriangleWithSpecialChar {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        char c=scanner.next().charAt(0);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("");
            }
            for(int k=0;k<=i;k++){
                System.out.print(c);
            }
            System.out.println("");
        }
        scanner.close();
    }
}
