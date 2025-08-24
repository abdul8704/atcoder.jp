// https://atcoder.jp/contests/abc419/tasks/abc419_a

import java.util.*;

public class A_AtCoder_Language {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
    
    if(s.equals("blue")){
      System.out.println("FFF");
    }
    else if(s.equals("green")){
      System.out.println("MMM");
    }
    else if(s.equals("red")){
      System.out.println("SSS");
    }
    else{
      System.out.println("Unknown");
    }

    sc.close();
  }
}
