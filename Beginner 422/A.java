import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("-");



        int world = Integer.parseInt(s[0]);
        int stage = Integer.parseInt(s[1]);

        if(stage < 8){
            System.out.println(world + "-" + (stage+1));
        }
        else if(stage == 8){
            System.out.println((world+1) + "-1");
        }
    }
}
