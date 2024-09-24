import java.util.Scanner;
public class GcdLcm{
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=scanner.nextInt();
        int GCD=gcd(num1,num2);
        int LCM=lcm(num1,num2);
        System.out.println("LCM of "+num1+" & "+num2+" is: "+LCM);
        scanner.close();
    }
    
}
