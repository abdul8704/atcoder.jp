// https://atcoder.jp/contests/abc420/tasks/abc420_a

import java.util.*;

public class A_What_month_is_it {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if((N+M) % 12 == 0)
            System.out.println(12);
        else
            System.out.println((N+M) % 12);
        
        sc.close();
    }
}
