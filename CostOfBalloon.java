
import java.util.*;

class CostOfBalloon {
    public static void main(String args[] ){

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i = 1; i <= t; i++){
           int cost_g = s.nextInt();
           int cost_p = s.nextInt(); 
           int par = s.nextInt();
           int x_total_cost = 0;
           int y_total_cost = 0;
           int myArray[] = new int[par*2];

           for(int j = 0; j< par*2; j++){
               myArray[j] = s.nextInt();
           }

           for(int j = 0; j< par*2; j++){
               if(j%2==0 && myArray[j]==1){
                   x_total_cost = x_total_cost + cost_g; 
                   y_total_cost = y_total_cost + cost_p;
               }else if(j%2==1 && myArray[j]==1){
                   x_total_cost = x_total_cost + cost_p;
                   y_total_cost = y_total_cost + cost_g; 
               }
           }
            System.out.println((x_total_cost>y_total_cost)?y_total_cost:x_total_cost);


        }

        
    s.close();
    }
}
