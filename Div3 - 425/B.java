import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        boolean[] vis = new boolean[N+1];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();

            if(arr[i] != -1 && vis[arr[i]]){
                System.out.println("No");
                return;
            }

            if(arr[i] != -1)
                vis[arr[i]] = true;
        }

        int ptr = 1;
        System.out.println("Yes");

        for(int i=0; i<N; i++){
            if(arr[i] == -1){
                while(vis[ptr])
                    ptr++;
                arr[i] = ptr++;
            }
            System.out.print(arr[i] + " ");
        }
        

        sc.close();
    }    
}
