// https://atcoder.jp/contests/abc416/tasks/abc416_b

import java.util.*;

public class B_1D_Akari{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      String s = sc.nextLine();
	  char[] str = s.toCharArray();

	  int lastHash = -1;
	  int lastO = -2;

	  for(int i=0; i<str.length; i++){
		if(str[i] == '#'){
			lastHash = i;
		}
		else{
			if(lastHash > lastO){
				str[i] = 'o';
				lastO = i;
			}
		}
	  }


	  for(int i=0; i<str.length; i++)
	  	System.out.print(str[i]+"");
		sc.close();
  }
}