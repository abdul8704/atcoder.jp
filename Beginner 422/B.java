import java.util.*;

public class B {
    private static int[][] offset = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private static boolean inBound(int r, int c, int R, int C){
        return (r >= 0 && c >= 0 && r < R && c < C);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][]mat = new char[R][C];
        sc.nextLine();

        for(int i=0; i<R; i++){
            String line = sc.nextLine();
            for(int j=0; j<C; j++){
                mat[i][j] = line.charAt(j);
            }
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(mat[i][j] == '.') continue;
                int count = 0;

                for(int[] off: offset){
                    int row = i+off[0];
                    int col = j+off[1];

                    if(inBound(row, col, R, C) && mat[row][col] == '#')
                        count++;
                }

                if(count != 2 && count != 4){
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
