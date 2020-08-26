
import java.util.*;


class ProfilePicher {
    public static void main(String args[] ){

        Scanner s = new Scanner(System.in);
        int l = s.nextInt();

        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            int w = s.nextInt();
            int h = s.nextInt();
            if(w < l || h < l){
                System.out.println("UPLOAD ANOTHER");
            }else if(w >= l && h >= l){
                if(w==h){
                    System.out.println("ACCEPTED");
                }else{
                    System.out.println("CROP IT");
                }
            }
        }
        s.close();
    }
}
