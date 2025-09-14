import java.util.*;

public class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long money = sc.nextLong();
        long comiss = sc.nextLong();

        long max =  1000 * (money / (1000 + comiss));

        System.out.println(max);

        sc.close();
    }
}