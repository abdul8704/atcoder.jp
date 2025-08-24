// https://atcoder.jp/contests/abc419/tasks/abc419_b

import java.util.*;

public class B_Get_Min {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int a = sc.nextInt();

            if(a == 1){
                min.offer(sc.nextInt());
            }
            else{
                System.out.println(min.poll());
            }
        }

        sc.close();
    }
}