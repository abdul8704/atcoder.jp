// https://atcoder.jp/contests/abc418/tasks/abc418_b

import java.util.*;

public class A_Im_A_Teapot {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        if(N < 3){
            System.out.println("No");
            sc.close();
            return;
        }

        if(s.charAt(N-1) == 'a' && s.charAt(N-2) =='e' && s.charAt(N-3) == 't')
            System.out.println("Yes");
        else    
            System.out.println("No");
    
        sc.close();
    }
}
