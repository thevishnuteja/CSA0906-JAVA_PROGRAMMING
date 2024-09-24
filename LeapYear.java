import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int year=scanner.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.print(year+" is a Leap Year");
        }else{
            System.out.print(year+" is not a Leap Year");
        }
        scanner.close();
    }
}