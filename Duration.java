
import java.util.*;


class Duration {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 1; i <= t; i++){
            int sh = s.nextInt();
            int sm = s.nextInt();
            int eh = s.nextInt();
            int em = s.nextInt();

            int rmin = (60-sm)+em;
            int rhour =  eh - (sh+1);
            if(rmin>=60){
                rhour = rhour + (rmin/60);
                rmin = rmin%60;
            }

            System.out.println(rhour+" "+rmin);
        }
        s.close();
    }
}
