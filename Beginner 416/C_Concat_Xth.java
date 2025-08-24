// https://atcoder.jp/contests/abc416/tasks/abc416_c

import java.util.*;

public class C_Concat_Xth {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
		int x = sc.nextInt();
		sc.nextLine();

		String[] strs = new String[n];
		List<String> perms = new ArrayList<>();
		
		for(int i=0; i<n; i++)
        strs[i] = sc.nextLine();
		
        generate(n, k,0,  new StringBuilder(), perms, strs);
		Collections.sort(perms);

		System.out.println(perms.get(x-1));

        // for(int i=0; i<perms.size(); i++)
        //     System.out.println(perms.get(i));
		sc.close();

    }

    static void generate(int n, int k, int depth, StringBuilder str, List<String> perms, String[] strs) {
        if (depth == k) {
            perms.add(str.toString());		
            return;
        }

        for (int i = 0; i < n; i++) {
            // str.append(strs[depth]);
            generate(n, k, depth + 1, new StringBuilder(str).append(strs[i]), perms, strs);
            // str.setLength(str.length() - strs[depth].length());
        }
    }
}
