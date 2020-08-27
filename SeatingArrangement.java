
import java.util.*;

class SeatingArrangement {
    public static void main(String args[] ){
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 1; i <= t; i++){
            int sno = s.nextInt();

           if(sno%12==0){
               System.out.print(sno-11);
               System.out.println(" WS");
           }else if(sno%12==1){
               System.out.print(sno+11);
               System.out.println(" WS");
           }else if(sno%12==2){
               System.out.print(sno+9);
               System.out.println(" MS");
           }else if(sno%12==3){
               System.out.print(sno+7);
               System.out.println(" AS");
           }else if(sno%12==4){
               System.out.print(sno+5);
               System.out.println(" AS");
           }else if(sno%12==5){
               System.out.print(sno+3);
               System.out.println(" MS");
           }else if(sno%12==6){
               System.out.print(sno+1);
               System.out.println(" WS");
           }else if(sno%12==7){
               System.out.print(sno-1);
               System.out.println(" WS");
           }else if(sno%12==8){
               System.out.print(sno-3);
               System.out.println(" MS");
           }else if(sno%12==9){
               System.out.print(sno-5);
               System.out.println(" AS");
           }else if(sno%12==10){
               System.out.print(sno-7);
               System.out.println(" AS");
           }else if(sno%12==11){
               System.out.print(sno-9);
               System.out.println(" MS");
           }
            
            
        }
        s.close();
    }
}
