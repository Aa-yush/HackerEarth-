
import java.util.*;

class FindProduct {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  
        int myArray[] = new int[n];
        long modulo = (long)((Math.pow(10,9))+7);
        long ans = 1;
      
        for(int i = 0; i < n; i++){
            myArray[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++){
            ans = (ans * myArray[i]) % modulo;
        }

        System.out.println(ans);               

    }
}
