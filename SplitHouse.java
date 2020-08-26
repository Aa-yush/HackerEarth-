import java.util.*;


class SplitHouse {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();   
        String v = s.next();
        String result = "";
        int flag = 0;
        
        if(v.contains("HH")){
            System.out.println("NO");
            flag=1;
        }else{
            for(int i = 0; i < n; i++){
                if(v.charAt(i)=='.'){
                    result = result + "B";
                }else{
                    result = result + "H";
                }
            }
        }
        if(flag==0){
        System.out.println("YES");
        System.out.println(result);
        }
        s.close();
    }
}
