import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {
    private static int[][] offset = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
    public static void main(String[] args){
        FastReader sc = new FastReader();

        int T = sc.nextInt();

        while(T-- > 0){
            solve(sc);
        }
    }
    private static void solve(FastReader sc){
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] mat = new char[R][C];

        for(int i=0; i<R; i++){
            String row = sc.next();   
            for(int j = 0; j < C; j++){
                mat[i][j] = row.charAt(j);
            }
        }

        System.out.println(dfs(mat, R, C, 0, Integer.MAX_VALUE));
        
    }
    private static int dfs(char[][] mat, int R, int C, int curr, int best){
        if(curr >= best) return best;
        boolean flag = true;

        for(int i=0; i<R-1; i++){
            for(int j=0; j<C-1; j++){
                if(mat[i][j] == '#' && mat[i+1][j] == '#' && mat[i][j+1] == '#' && mat[i+1][j+1] == '#'){
                    flag = false;
                    for(int[] off: offset){
                        mat[i+off[0]][j+off[1]] = '.';
                        curr++;
                        best = Math.min(best, dfs(mat, R, C, curr, best));
                        curr--;
                        mat[i+off[0]][j+off[1]] = '#';

                    }
                    return best;
                }
            }
        }

        if(flag)
            best = Math.min(curr, best);

        return best;
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
