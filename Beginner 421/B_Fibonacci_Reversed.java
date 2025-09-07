import java.util.Scanner;

public class B_Fibonacci_Reversed{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        for(int i=1; i<=8; i++){
            long t = A + B;
            t = rev(t);

            A = B;
            B = t;
        }
        System.out.println(B);

        sc.close();
    }
    private static long rev(long n){
        long res = 0;
        while(n > 0){
            res = (res * 10) + (n % 10);
            n /= 10;
        }
        return res;
    }
}