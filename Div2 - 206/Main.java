import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();

        int[] arr = new int[N];

        String[] s = sc.nextLine().split(" ");

        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(s[i]);
        
        int count = 1;

        for(int left = 0; left<N; left++){
            if(left > 0 && arr[left] == arr[left-1])
                continue;
            for(int right = N-1; right > left; right--){
                if(right == N-1){
                    count++;
                    continue;
                }
                
                if( arr[left] == arr[right+1])
                    continue;
                count++;
            }
        }
        if(arr.length > 1 && arr[0] == arr[1])
            count--;

        System.out.println(count);
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
