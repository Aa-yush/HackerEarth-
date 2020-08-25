
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
  
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();   
        int fact = 1 ;
        for(int i = num; i >= 1; i--){
            fact = fact * i;
        }    
        System.out.println(fact);        
    }
}
