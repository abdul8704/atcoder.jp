import java.util.Scanner;

public class B{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K =sc.nextInt();

            int[] ppl = new int[N];

            while(K-- > 0){
               int person = sc.nextInt();
               int problem = sc.nextInt();

               ppl[person-1]++;
               if(ppl[person-1] == M)
                  System.out.print((person) + " ");
            } 

    }
}