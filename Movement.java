import java.util.Scanner;

public class Movement {
    public static void main(String args[] ){

        Scanner s = new Scanner(System.in);
        int number = s.nextInt(); 
        int divNum = 5;

        int steps = number / divNum;
        
        if(number % 5 == 0 ){
            System.out.println(steps);
        }else{
            System.out.println(steps+1);
        }
        s.close();
    }
}