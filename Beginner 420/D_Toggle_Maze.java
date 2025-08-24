// https://atcoder.jp/contests/abc420/tasks/abc420_d

import java.util.*;

public class D_Toggle_Maze {
    // right up down left
    private static int[][] offset = {{0, 1}, {-1, 0}, {1, 0}, {0, -1}};

    private static boolean inBound(int row, int col, int R, int C){
        return (row >= 0 && col >=0 && row < R && col < C);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[N][M];

        int startR = 0, startC = 0, goalR = 0, goalC = 0;

        for(int i=0; i<N; i++){
            String s = sc.nextLine();
            for(int j=0; j<M; j++){
                char ch = s.charAt(j);
                grid[i][j] = ch;

                if(ch == 'S'){
                    startR = i;
                    startC = j;
                }
                else if(ch == 'G'){
                    goalR = i;
                    goalC = j;
                }
            }
        }

        int[] state = {startR, startC, 0};
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[N][M][2];

        visited[startR][startC][0] = true;
        queue.offer(state);
        int moves = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            while(size-- > 0){
                int[] curr = queue.poll();
                int row = curr[0], col = curr[1], status = curr[2];

                // System.out.println("now " + row + " " + col);

                if(row == goalR && col == goalC){
                    System.out.println(moves);
                    sc.close();
                    return;
                }

                for(int i=0; i<offset.length; i++){
                    int nextR = row + offset[i][0];
                    int nextC = col + offset[i][1];

                    if(!inBound(nextR, nextC, N, M) || grid[nextR][nextC] == '#')
                        continue;
                    
                    if((grid[nextR][nextC] == 'o' && status != 0) || (grid[nextR][nextC] == 'x' && status != 1))
                        continue;
                    
                    int nextStatus = status;
                    
                    if(grid[nextR][nextC] == '?')
                        nextStatus = (status == 1) ? 0: 1;
                    
                    if(visited[nextR][nextC][nextStatus])
                        continue;
                    
                    visited[nextR][nextC][nextStatus] = true;
                    queue.offer(new int[]{ nextR, nextC, nextStatus });
                }
            }
            moves++;
        }

        System.out.println(-1);
        sc.close();

    }
}


