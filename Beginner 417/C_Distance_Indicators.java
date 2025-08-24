// https://atcoder.jp/contests/abc417/tasks/abc417_c

import java.util.*;

public class C_Distance_Indicators {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        Map<Long, Long> map = new HashMap<>();

        int N = sc.nextInt(); long count = 0;
        
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

            long val = (long)i - arr[i];
            if(map.containsKey(val))
                count += map.get(val);

            long find = (long)arr[i] + (long)i;
            map.put(find, map.getOrDefault(find, 0L) + 1);

        }


        System.out.println(count);
        sc.close();
    }
}
