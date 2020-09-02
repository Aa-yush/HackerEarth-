import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         String out_ = solve(A);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String solve(int[] A){
        int i = 0;
        int digit = 0;
        for(; i < A.length / 2; i++ ){
            if(i % 2 == 0 ){
                digit = digit + (A[i]+"").charAt(0);
            }else{
                digit = digit - (A[i]+"").charAt(0);
            }
        }
        for(; i < A.length; i++){
            if(i % 2 == 0 ){
                digit = digit + (A[i]+"").charAt((A[i]+"").length()-1);
            }else{
                digit = digit - (A[i]+"").charAt((A[i]+"").length()-1);
            }
        }
        if(digit % 11 == 0){
            return "OUI";
        }else{
            return "NON";
        }
    }
}