
import java.util.*;

class VCPair {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int ncase = s.nextInt();
        char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 1; i <= ncase; i++) {
            int ele = s.nextInt();
            String stmt = s.next();
            char[] ch = stmt.toCharArray();
            int pair = 0;
            for (int j = 0; j < ele; j++) {
                boolean flag = true;
                for (int k = 0; k < vowel.length; k++) {
                    if (ch[j] == vowel[k]) {
                        flag = false;
                    }
                }
                if (flag && j != ele - 1) {
                    boolean finalFlag = false;
                    int t = j + 1;
                    for (int l = 0; l < vowel.length; l++) {
                        if (ch[t] == vowel[l]) {
                            finalFlag = true;
                        }
                    }
                    if (finalFlag) {
                        pair++;
                    }
                }
            }
            System.out.println(pair);

        }
        s.close();
    }
}
