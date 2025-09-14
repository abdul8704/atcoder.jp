import java.util.*;

public class B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr =new int[N];

        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();

        int reach = 2;

        int l =0, r = N-1;
        boolean Left = true, Right = true;

        while(l < r && (Left || Right)){
            if(arr[l++] == 1)
                Left = false;
            reach += (Left) ? 1: 0;

            if(arr[r--] == 1)
                Right = false;
            
            reach += (Right) ? 1: 0;
        }

        System.out.println((N+1) - (reach));
        
        sc.close();
    }
}