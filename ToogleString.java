
import java.util.*;

class ToogleString {
    public static void main(String args[] ){

        Scanner s = new Scanner(System.in);
        String line = s.nextLine(); 

        char ch[] = line.toCharArray();

        for(int i = 0 ; i < ch.length; i++){
            if(Character.isUpperCase(ch[i])){
                System.out.print(Character.toLowerCase(ch[i]));
            }else{
                System.out.print(Character.toUpperCase(ch[i]));
            }
        }
        s.close();
    }
}
