// https://atcoder.jp/contests/abc420/tasks/abc420_b

import java.util.*;

public class B_Most_Minority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[] score = new int[N];
        char[][] votes = new char[N][M];

        for(int i=0; i<N; i++)
            votes[i] = sc.nextLine().toCharArray();
        
        for(int i=0; i<M; i++){
            int minor = 0;
            char point = '0';

            for(int j=0; j<N; j++)
                minor += (votes[j][i] == '0') ? -1: 1;
            
            point = (minor > 0) ? '0': '1';

            for(int j=0; j<N; j++)
                if(votes[j][i] == point)
                    score[j]++;
            
        }


        int max = 0;
        for(int i=0; i<N; i++)
            max = Math.max(max, score[i]);
        
        for(int i=0; i<N; i++){
            if(score[i] == max)
                System.out.print((i+1) + " ");
        }

        sc.close();
    }
}
