// https://atcoder.jp/contests/abc417/tasks/abc417_b

import java.util.*;

public class B_Search_And_Delete {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }
        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
            int idx = bs(arr, B[i]);
            if(idx != -1)
                arr.remove(idx);
        }

        for(int n: arr)
            System.out.print(n + " ");

        sc.close();
    }
    private static int bs(List<Integer> arr, int target) {
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
}
