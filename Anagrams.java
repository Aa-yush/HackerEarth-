

import java.util.*;

public class Anagrams {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());

        for(int i = 1;  i <= t; i++){
            String fs = s.nextLine();
            String ss = s.nextLine();
            char[] c_fs = fs.toCharArray();
            char[] c_ss = ss.toCharArray();
            int total_size = c_fs.length + c_ss.length;
            for(int j = 0 ; j < c_fs.length; j++){
                for(int k = 0; k < c_ss.length; k++){
                    if(c_fs[j]==c_ss[k] ){
                        c_ss[k]='0';
                        total_size = total_size - 2;                      
                        break;
                    }
                }
            }
            System.out.println(total_size);
        }      


    }
}
