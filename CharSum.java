import java.util.Scanner;

public class CharSum {
    public static void main(String args[] ) {
  
        Scanner s = new Scanner(System.in);
        String alpha = s.nextLine();

        char[] ch = alpha.toCharArray();
        int weight = 0 ;
        for(int i = 0; i < ch.length; i++ ){
            int myChar = ch[i];
            System.out.println(myChar);
            weight = weight + (myChar - 96);
        }
        System.out.println(weight);
        s.close();
    }
}