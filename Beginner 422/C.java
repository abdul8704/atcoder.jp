import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while(T-- > 0){
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = sc.nextLong();

            Long min = Math.min(a, c);
            
            Long max = (a+b+c) / 3;
            Long ans = Math.min(min, max);
            System.out.println(ans);
        }
    }
}
 