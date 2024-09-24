public class SkipingNumbers {
    public static void main(String[] args) {
        int m=30;
        int n=100;
        int k=8;
        for(int i=m;i<=n;i+=k+1){
            System.out.println(i);
        }
    }
}
