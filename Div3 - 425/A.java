import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long num = 0;

        for(int i=1; i<= N; i++){
            long cube = i * i * i;

            num += (i % 2 == 1) ? -cube: cube;
        }

        System.out.println(num);;
        sc.close();
    }    
}
