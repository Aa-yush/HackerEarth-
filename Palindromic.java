
import java.util.*;

class Palindromic {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String myString = s.nextLine();
        char c_myString[] = myString.toCharArray();
        String str = "";

        for(int i = c_myString.length-1; i >= 0; i--){
            str =str + c_myString[i];
        }

        if(myString.equals(str)){
            System.out.println("YES");
        }else{
           System.out.println("NO"); 
        }

        


    }
}
