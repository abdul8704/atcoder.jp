// https://atcoder.jp/contests/abc420/tasks/abc420_c

import java.util.*;

public class C_Sum_of_Min_Query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        long[] A = new long[N];
        long[] B = new long[N];

        for(int i=0; i<N; i++)
            A[i] = sc.nextLong();
        
        for(int i=0; i<N; i++)
            B[i] = sc.nextLong();
        
        long sum = 0;
        for(int i=0; i<N; i++)
            sum += Math.min(A[i], B[i]);
        
        for(int i=0; i<M; i++){
            char ch = sc.next().charAt(0);
            int idx = sc.nextInt();
            int val = sc.nextInt();

            if(ch == 'A'){
                if(A[idx - 1] > B[idx-1])
                    sum -= B[idx-1];
                else
                    sum -= A[idx-1];

                A[idx-1] = val;
                sum += Math.min(A[idx-1], B[idx-1]);
                
            }
            else{
                if(B[idx - 1] > A[idx-1])
                    sum -= A[idx-1];
                else
                    sum -= B[idx-1];

                B[idx-1] = val;
                sum += Math.min(A[idx-1], B[idx-1]);
                   
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
