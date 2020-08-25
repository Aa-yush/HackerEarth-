
import java.util.*;


class BricksGame{
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();  
        int patlu,motu=0;
        
        for(int round = 1; true ;round++){
            patlu = round;
            num = num - patlu;
            if(num <= 0){
                System.out.println("Patlu");
                break;
            }
            motu = round * 2;
            num = num - motu;
            if(num <= 0){
                System.out.println("Motu");
                break;
            }

        }

    }
}
