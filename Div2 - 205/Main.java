import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int Q = sc.nextInt();

        char[][] mat = new char[N][N];

        for(int i=0; i<N; i++){
            String line = sc.nextLine();
            for(int j=0; j<N; j++){
                mat[i][j] =  line.charAt(j);

            }
        }

        boolean[][] notOk = new boolean[N][N];

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1; j++){
                if(mat[i][j] == '#' || mat[i+1][j] == '#' || mat[i][j+1] == '#' || mat[i+1][j+1] == '#')
                    notOk[i][j] = true;
            }
        }

        for(int i=0; i<N; i++){
            notOk[i][N-1] = true;
            notOk[N-1][i] = true;
        }

        // for(int i=0; i<N; i++){
        //     for(int j=0; j<N; j++){
        //         if(notOk[i][j])
        //             System.out.print("#");
        //         else    
        //             System.out.print(".");
        //     }
        //     System.out.println();
        // }

        for(int q=0; q<Q; q++){
            int U = sc.nextInt() - 1;
            int D = sc.nextInt() - 1;
            int L = sc.nextInt() - 1;
            int R = sc.nextInt() - 1;

            int flips = 0;
            
            for(int row=U; row<D; row++){
                for(int col=L; col <R; col++){    
                    if(!notOk[row][col])
                        flips++;
                }
            }

            System.out.println(flips);
            
        }
    }
}



class FastReader {
    private BufferedReader br;
    private StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
