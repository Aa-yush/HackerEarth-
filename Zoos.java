
import java.util.*;

class Zoos {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        String word = s.nextLine(); 
        char[] c_word = word.toCharArray();
        int x = 0, y = 0 ;
        

        for(int i = 0 ; i < c_word.length; i++){
            if(c_word[i]=='Z'||c_word[i]=='z'){
                x++;
            }else{
                y++;
            }
        }
        if((2*x)==y){
            System.out.println("Yes");
        }else{
           System.out.println("No"); 
        }

    }
}
