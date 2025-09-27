
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class E{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while(T-- > 0)
                solve(sc);

    }
    private static void solve(Scanner sc){
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(N-- > 0)
            pq.offer(sc.nextDouble());
        
        while(K-- > 0){
            Double stick = pq.poll();
            pq.offer(stick/2);
            pq.offer(stick/2);
        }

        while(X-- > 1){
            pq.poll();
        }

        System.out.println(pq.poll());
    }
}