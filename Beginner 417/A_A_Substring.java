// https://atcoder.jp/contests/abc417/tasks/abc417_a

import java.util.*;

public class A_A_Substring{
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

        int N = sc.nextInt();
        int start = sc.nextInt();
        int end  = sc.nextInt();

        sc.nextLine();
        
        String s = sc.nextLine();

        for(int i=start; i< N-end; i++)
        System.out.print(s.charAt(i));
        
        sc.close();
        return;
    }
}
