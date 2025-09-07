import java.util.Scanner;

public class A_Misdelivery{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] str = new String[N];

        for(int i = 0; i < N; i++){
            str[i] = sc.nextLine();
        }

        int Y = sc.nextInt();  
        String s = sc.nextLine().trim();

        if(str[Y-1].equals(s))
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}