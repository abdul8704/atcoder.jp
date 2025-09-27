import java.util.Scanner;

public class C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];
        long[] pre = new long[N];
        int off = 0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            pre[i] = (i > 0) ? pre[i-1] + arr[i]: arr[i];
        }
        // for(int i=0; i<N; i++){
        //     System.out.print(pre[i] + " ");
        // }
        //     System.out.println();
        
        for(int i=0; i<Q; i++){
            int type = sc.nextInt();

            if(type == 1){
                int k = sc.nextInt();
                off += k;
                off %= N;
            }
            else{
                int l = sc.nextInt();
                int r = sc.nextInt();

                int left = ((l-1) + off) % N;
                int right = ((r-1) + off) % N; 

                if(left <= right)
                    System.out.println( (pre[right] -((left - 1 >= 0) ? pre[left-1]: 0)));
                else
                    System.out.println((pre[N - 1] - (left > 0 ? pre[left - 1] : 0)) + pre[right]) ;
            }
        }
        sc.close();
    }    
}
