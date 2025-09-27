import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class C{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            boolean[] skills = new boolean[N+1];
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            int count = 0;

            for(int i=1; i<=N; i++){
                int A = sc.nextInt();
                int B = sc.nextInt();

                if(A == 0 && B == 0){
                    skills[i] = true;
                }
                else if((skills[A]) || (skills[B])){
                    skills[i] = true;
                }

                if(A != 0){
                    if(map.containsKey(A))
                        map.get(A).add(i);
                    else{
                        List<Integer> l = new ArrayList<>();
                        l.add(i);
                        map.put(A, l);
                    }
                }
                if(B != 0){
                    if(map.containsKey(B))
                        map.get(B).add(i);
                    else{
                        List<Integer> l = new ArrayList<>();
                        l.add(i);
                        map.put(B, l);
                    }
                }
                


            }
            Queue<Integer> q = new LinkedList<>();
            for(int i=1; i<= N; i++){
                if(skills[i]) q.offer(i);
            }

            while(!q.isEmpty()){
                int i = q.poll();
                
                if(map.containsKey(i)){
                    for(int skill: map.get(i)){
                        if(!skills[skill]){
                            skills[skill] = true;
                            q.offer(skill);
                        }
                    }
                }
                // System.out.println("no");
            }

             for(int i=1; i<= N; i++){
                if(skills[i]) count++;
            }


            System.out.println(count);

    }
}