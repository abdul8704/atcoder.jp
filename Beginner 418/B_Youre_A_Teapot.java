// https://atcoder.jp/contests/abc418/tasks/abc418_b

import java.util.*;

public class B_Youre_A_Teapot {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        
        String s = sc.nextLine();
        int N = s.length();
        double count=0;

        for(int i=0; i<N; i++){
            if(s.charAt(i) == 't'){
                int f=1;

                for(int j=i+1; j<N; j++){
                    if(s.charAt(j) == 't'){
                        f++;
                        if(j-i+1 >= 3)
                            count = Math.max(count, ((double) f-2) /((double) j-i-1));
                    }
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
